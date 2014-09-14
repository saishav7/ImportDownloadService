/*
 * XML Type:  Name
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.Name
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * An XML Name(@http://schemas.xmlsoap.org/soap/encoding/).
 *
 * This is an atomic type that is a restriction of org.xmlsoap.schemas.soap.encoding.Name.
 */
public class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.xmlsoap.schemas.soap.encoding.Name
{
    
    public NameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName HREF$2 = 
        new javax.xml.namespace.QName("", "href");
    
    
    /**
     * Gets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getId()
=======
    public java.lang.String getId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlID xgetId()
=======
    public org.apache.xmlbeans.XmlID xgetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetId()
=======
    public boolean isSetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void setId(java.lang.String id)
=======
    public void setId(java.lang.String id)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetId(org.apache.xmlbeans.XmlID id)
=======
    public void xsetId(org.apache.xmlbeans.XmlID id)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetId()
=======
    public void unsetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getHref()
=======
    public java.lang.String getHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlAnyURI xgetHref()
=======
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetHref()
=======
    public boolean isSetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$2) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void setHref(java.lang.String href)
=======
    public void setHref(java.lang.String href)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$2);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
=======
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$2);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetHref()
=======
    public void unsetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$2);
        }
    }
}
