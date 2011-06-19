package org.xwiki.android.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwiki.android.resources.Page;
import org.xwiki.android.resources.Pages;

import sun.util.calendar.ZoneInfo;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PageResources extends HttpConnector
{

    private final String PAGE_URL_PREFIX = "/xwiki/rest/wikis/";

    private final String PAGE_URL_SUFFIX = "/pages?media=json";

    private final String JSON_URL_SUFFIX = "?media=json";

    private final String JSON_ARRAY_IDENTIFIER = "pageSummaries";

    private String URLprefix;

    private String wikiName;

    private String spaceName;

    public PageResources(String URLprefix, String wikiName, String spaceName)
    {
        this.URLprefix = URLprefix;
        this.wikiName = wikiName;
        this.spaceName = spaceName;
    }

    // get all pages [ok]
    public Pages getAllPages()
    {
        String Uri = "http://" + URLprefix + PAGE_URL_PREFIX + wikiName + "/spaces/" + spaceName + PAGE_URL_SUFFIX;

        return decodePages(super.getResponse(Uri));
    }

    // get page [ok]
    public Page getPage(String pageName)
    {
        String Uri =
            "http://" + URLprefix + PAGE_URL_PREFIX + wikiName + "/spaces/" + spaceName + "/pages/" + pageName
                + JSON_URL_SUFFIX;

        return decodePage(super.getResponse(Uri));
    }

    // Delete page
    public String deletePage(String pageName)
    {
        String Uri =
            "http://" + URLprefix + PAGE_URL_PREFIX + wikiName + "/spaces/" + spaceName + "/pages/" + pageName
                + JSON_URL_SUFFIX;

        return super.deleteRequest(Uri);
    }

    // Get page history on version
    public Page getPageHistoryOnVersion(String pageName, String version)
    {
        String Uri =
            "http://" + URLprefix + PAGE_URL_PREFIX + wikiName + "/spaces/" + spaceName + "/pages/" + pageName
                + "/history/" + version + JSON_URL_SUFFIX;

        return decodePage(super.getResponse(Uri));
    }

    // Get page children
    public Pages getPageChildren(String pageName)
    {
        String Uri =
            "http://" + URLprefix + PAGE_URL_PREFIX + wikiName + "/spaces/" + spaceName + "/pages/" + pageName
                + "/children" + JSON_URL_SUFFIX;

        return decodePages(super.getResponse(Uri));
    }

    // Temporary method to decode JSON reply
    public String decodeAllPagesResponse(String response)
    {

        String wikiResultText = "";
        try {
            JSONObject jsonobject = new JSONObject(response);
            JSONArray dataArray = jsonobject.getJSONArray(JSON_ARRAY_IDENTIFIER);

            Log.d("JSON", "JSON array built");

            Log.d("JSON", "Number of entrees in array: " + dataArray.length());

            for (int i = 0; i < dataArray.length(); i++) {
                if (!dataArray.isNull(i)) {
                    JSONObject item = dataArray.getJSONObject(i);

                    if (item.has("id")) {
                        String id = item.getString("id");
                        Log.d("JSON Array", "id= " + id);
                        wikiResultText += ("\n" + id);
                    }
                }
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.d("JSON", "Error in JSON object or Array");
        }

        return wikiResultText;
    }

    // Temporary method to decode JSON reply
    public String decodePageResponse(String response, String key)
    {

        String wikiResultText = "";
        try {
            JSONObject jsonobject = new JSONObject(response);
            JSONArray dataArray = jsonobject.getJSONArray(key);

            Log.d("JSON", "JSON array built");

            Log.d("JSON", "Number of entrees in array: " + dataArray.length());

            for (int i = 0; i < dataArray.length(); i++) {
                if (!dataArray.isNull(i)) {
                    JSONObject item = dataArray.getJSONObject(i);

                    if (item.has("pageId")) {
                        String id = item.getString("pageId");
                        Log.d("JSON Array", "id= " + id);
                        wikiResultText += ("\n" + id);
                    }
                }
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.d("JSON", "Error in JSON object or Array");
        }

        return wikiResultText;
    }

    // decode json content to Pages element
    private Pages decodePages(String content)
    {
        Gson gson = new Gson();

        Pages pages = new Pages();
        pages = gson.fromJson(content, Pages.class);
        return pages;
    }

    // decode json content to Page element
    private Page decodePage(String content)
    {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // gsonBuilder.registerTypeAdapter(sun.util.calendar.ZoneInfo.class, new TimeZoneDeserializer());
        // gsonBuilder.registerTypeAdapter(ZoneInfo.class, new TimeZoneDeserializer());
        // Gson gson = gsonBuilder.create();

        Gson gson = new Gson();
        Page page = new Page();
        page = gson.fromJson(content, Page.class);

        // Manually deserialize Calendar

        try {
            JSONObject jsonobject = new JSONObject(content);
            String created = jsonobject.getString("created");
            page.created1 = convertToCalendar(created);
            String modified = jsonobject.getString("modified");
            page.modified1 = convertToCalendar(modified);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return page;
    }

    private GregorianCalendar convertToCalendar(String jsonText)
    {

        GregorianCalendar greg = new GregorianCalendar();
        ArrayList<String> allData = new ArrayList<String>();

        String first = jsonText.substring(28, 98);
        int x = jsonText.indexOf("]");
        first += jsonText.substring(x + 1, jsonText.length() - 1);
        String[] firstdata = first.split(",");
        for (int i = 0; i < firstdata.length; i++) {
            String[] seperate = firstdata[i].split("=");
            allData.add(seperate[1]);
        }

        // Get ZoneInfo
        int w = jsonText.indexOf("id");
        String second = jsonText.substring(w, x);
        String[] seconddata = second.split(",");
        for (int i = 0; i < seconddata.length; i++) {
            String[] seperate = seconddata[i].split("=");
            allData.add(seperate[1]);
        }
        Log.d("allData", allData.toString());

        //ZoneInfo zi;
        //Log.d("zi info", allData.get(23) + " and " + allData.get(24));
        // zi= new ZoneInfo();
        // zi.setID(allData.get(23));
        // zi.setRawOffset(Integer.parseInt(allData.get(24)));
        // zi = new ZoneInfo(allData.get(23), Integer.parseInt(allData.get(24)));
        // greg.setTimeZone(zi);
        greg.setTimeInMillis(Long.parseLong(allData.get(0)));
        greg.setFirstDayOfWeek(Integer.parseInt(allData.get(4)));
        greg.setMinimalDaysInFirstWeek(Integer.parseInt(allData.get(5)));
        return greg;
    }

}
