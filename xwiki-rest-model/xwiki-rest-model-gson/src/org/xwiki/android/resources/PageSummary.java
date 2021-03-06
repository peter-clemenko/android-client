//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.02 at 07:04:45 PM IST 
//

package org.xwiki.android.resources;

import java.util.Collection;

/*
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlSeeAlso;
 import javax.xml.bind.annotation.XmlType;
 */

/**
 * <p>
 * Java class for PageSummary complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xwiki.org}LinkCollection">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wiki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="space" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xwikiRelativeUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xwikiAbsoluteUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translations" type="{http://www.xwiki.org}Translations"/>
 *         &lt;element name="syntax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
/*
 * //@XmlAccessorType(XmlAccessType.FIELD) //@XmlType(name = "PageSummary", propOrder = { "id", "fullName", "wiki",
 * "space", "name", "title", "parent", "parentId", "xwikiRelativeUrl", "xwikiAbsoluteUrl", "translations", "syntax" })
 * //@XmlSeeAlso({ Page.class })
 */
public class PageSummary extends LinkCollection
{

    // @XmlElement(required = true)
    public String id;

    // @XmlElement(required = true)
    public String fullName;

    // @XmlElement(required = true)
    public String wiki;

    // @XmlElement(required = true)
    public String space;

    // @XmlElement(required = true)
    public String name;

    // @XmlElement(required = true)
    public String title;

    // @XmlElement(required = true)
    public String parent;

    // @XmlElement(required = true)
    public String parentId;

    // @XmlElement(required = true)
    public String xwikiRelativeUrl;

    // @XmlElement(required = true)
    public String xwikiAbsoluteUrl;

    // @XmlElement(required = true)
    public Translations translations;

    // @XmlElement(required = true)
    public String syntax;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setId(String value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return possible object is {@link String }
     */
    public String getFullName()
    {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setFullName(String value)
    {
        this.fullName = value;
    }

    /**
     * Gets the value of the wiki property.
     * 
     * @return possible object is {@link String }
     */
    public String getWiki()
    {
        return wiki;
    }

    /**
     * Sets the value of the wiki property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWiki(String value)
    {
        this.wiki = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return possible object is {@link String }
     */
    public String getSpace()
    {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSpace(String value)
    {
        this.space = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return possible object is {@link String }
     */
    public String getParent()
    {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setParent(String value)
    {
        this.parent = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return possible object is {@link String }
     */
    public String getParentId()
    {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setParentId(String value)
    {
        this.parentId = value;
    }

    /**
     * Gets the value of the xwikiRelativeUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getXwikiRelativeUrl()
    {
        return xwikiRelativeUrl;
    }

    /**
     * Sets the value of the xwikiRelativeUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setXwikiRelativeUrl(String value)
    {
        this.xwikiRelativeUrl = value;
    }

    /**
     * Gets the value of the xwikiAbsoluteUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getXwikiAbsoluteUrl()
    {
        return xwikiAbsoluteUrl;
    }

    /**
     * Sets the value of the xwikiAbsoluteUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setXwikiAbsoluteUrl(String value)
    {
        this.xwikiAbsoluteUrl = value;
    }

    /**
     * Gets the value of the translations property.
     * 
     * @return possible object is {@link Translations }
     */
    public Translations getTranslations()
    {
        return translations;
    }

    /**
     * Sets the value of the translations property.
     * 
     * @param value allowed object is {@link Translations }
     */
    public void setTranslations(Translations value)
    {
        this.translations = value;
    }

    /**
     * Gets the value of the syntax property.
     * 
     * @return possible object is {@link String }
     */
    public String getSyntax()
    {
        return syntax;
    }

    /**
     * Sets the value of the syntax property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSyntax(String value)
    {
        this.syntax = value;
    }

    public PageSummary withId(String value)
    {
        setId(value);
        return this;
    }

    public PageSummary withFullName(String value)
    {
        setFullName(value);
        return this;
    }

    public PageSummary withWiki(String value)
    {
        setWiki(value);
        return this;
    }

    public PageSummary withSpace(String value)
    {
        setSpace(value);
        return this;
    }

    public PageSummary withName(String value)
    {
        setName(value);
        return this;
    }

    public PageSummary withTitle(String value)
    {
        setTitle(value);
        return this;
    }

    public PageSummary withParent(String value)
    {
        setParent(value);
        return this;
    }

    public PageSummary withParentId(String value)
    {
        setParentId(value);
        return this;
    }

    public PageSummary withXwikiRelativeUrl(String value)
    {
        setXwikiRelativeUrl(value);
        return this;
    }

    public PageSummary withXwikiAbsoluteUrl(String value)
    {
        setXwikiAbsoluteUrl(value);
        return this;
    }

    public PageSummary withTranslations(Translations value)
    {
        setTranslations(value);
        return this;
    }

    public PageSummary withSyntax(String value)
    {
        setSyntax(value);
        return this;
    }

    @Override
    public PageSummary withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public PageSummary withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }

}
