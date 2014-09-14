/*
 * An XML document type.
 * Localname: unsignedByte
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.UnsignedByteDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one unsignedByte(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class UnsignedByteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.UnsignedByteDocument
{
    
    public UnsignedByteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDBYTE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedByte");
    
    
    /**
     * Gets the "unsignedByte" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedByte getUnsignedByte()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedByte getUnsignedByte()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedByte target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsignedByte" element
     */
<<<<<<< HEAD
    @Override
	public void setUnsignedByte(org.xmlsoap.schemas.soap.encoding.UnsignedByte unsignedByte)
=======
    public void setUnsignedByte(org.xmlsoap.schemas.soap.encoding.UnsignedByte unsignedByte)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedByte target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.UnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.set(unsignedByte);
        }
    }
    
    /**
     * Appends and returns a new empty "unsignedByte" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedByte addNewUnsignedByte()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedByte addNewUnsignedByte()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedByte target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            return target;
        }
    }
}
