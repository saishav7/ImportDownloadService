/*
 * An XML document type.
 * Localname: unsignedLong
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.UnsignedLongDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one unsignedLong(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class UnsignedLongDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.UnsignedLongDocument
{
    
    public UnsignedLongDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDLONG$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedLong");
    
    
    /**
     * Gets the "unsignedLong" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedLong getUnsignedLong()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedLong getUnsignedLong()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedLong target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsignedLong" element
     */
<<<<<<< HEAD
    @Override
	public void setUnsignedLong(org.xmlsoap.schemas.soap.encoding.UnsignedLong unsignedLong)
=======
    public void setUnsignedLong(org.xmlsoap.schemas.soap.encoding.UnsignedLong unsignedLong)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedLong target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.UnsignedLong)get_store().add_element_user(UNSIGNEDLONG$0);
            }
            target.set(unsignedLong);
        }
    }
    
    /**
     * Appends and returns a new empty "unsignedLong" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedLong addNewUnsignedLong()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedLong addNewUnsignedLong()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedLong target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedLong)get_store().add_element_user(UNSIGNEDLONG$0);
            return target;
        }
    }
}
