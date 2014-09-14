/*
 * An XML document type.
 * Localname: unsignedShort
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.UnsignedShortDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one unsignedShort(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class UnsignedShortDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.UnsignedShortDocument
{
    
    public UnsignedShortDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDSHORT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedShort");
    
    
    /**
     * Gets the "unsignedShort" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedShort getUnsignedShort()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedShort getUnsignedShort()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedShort target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsignedShort" element
     */
<<<<<<< HEAD
    @Override
	public void setUnsignedShort(org.xmlsoap.schemas.soap.encoding.UnsignedShort unsignedShort)
=======
    public void setUnsignedShort(org.xmlsoap.schemas.soap.encoding.UnsignedShort unsignedShort)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedShort target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.UnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.set(unsignedShort);
        }
    }
    
    /**
     * Appends and returns a new empty "unsignedShort" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedShort addNewUnsignedShort()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedShort addNewUnsignedShort()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedShort target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            return target;
        }
    }
}
