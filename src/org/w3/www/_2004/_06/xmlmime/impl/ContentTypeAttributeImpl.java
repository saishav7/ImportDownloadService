/*
 * An XML attribute type.
 * Localname: contentType
 * Namespace: http://www.w3.org/2004/06/xmlmime
 * Java type: org.w3.www._2004._06.xmlmime.ContentTypeAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.www._2004._06.xmlmime.impl;
/**
 * A document containing one contentType(@http://www.w3.org/2004/06/xmlmime) attribute.
 *
 * This is a complex type.
 */
public class ContentTypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www._2004._06.xmlmime.ContentTypeAttribute
{
    
    public ContentTypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2004/06/xmlmime", "contentType");
    
    
    /**
     * Gets the "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getContentType()
=======
    public java.lang.String getContentType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType xgetContentType()
=======
    public org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType xgetContentType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType target = null;
            target = (org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType)get_store().find_attribute_user(CONTENTTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetContentType()
=======
    public boolean isSetContentType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTENTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public void setContentType(java.lang.String contentType)
=======
    public void setContentType(java.lang.String contentType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTTYPE$0);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetContentType(org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType contentType)
=======
    public void xsetContentType(org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType contentType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType target = null;
            target = (org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                target = (org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType)get_store().add_attribute_user(CONTENTTYPE$0);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Unsets the "contentType" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetContentType()
=======
    public void unsetContentType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTENTTYPE$0);
        }
    }
    /**
     * An XML contentType(@http://www.w3.org/2004/06/xmlmime).
     *
     * This is an atomic type that is a restriction of org.w3.www._2004._06.xmlmime.ContentTypeAttribute$ContentType.
     */
    public static class ContentTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.w3.www._2004._06.xmlmime.ContentTypeAttribute.ContentType
    {
        
        public ContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ContentTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
