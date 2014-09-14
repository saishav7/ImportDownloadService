/*
 * An XML document type.
 * Localname: unsignedInt
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.UnsignedIntDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one unsignedInt(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class UnsignedIntDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.UnsignedIntDocument
{
    
    public UnsignedIntDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDINT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "unsignedInt");
    
    
    /**
     * Gets the "unsignedInt" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedInt getUnsignedInt()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedInt getUnsignedInt()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedInt target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsignedInt" element
     */
<<<<<<< HEAD
    @Override
	public void setUnsignedInt(org.xmlsoap.schemas.soap.encoding.UnsignedInt unsignedInt)
=======
    public void setUnsignedInt(org.xmlsoap.schemas.soap.encoding.UnsignedInt unsignedInt)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedInt target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.UnsignedInt)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.set(unsignedInt);
        }
    }
    
    /**
     * Appends and returns a new empty "unsignedInt" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.UnsignedInt addNewUnsignedInt()
=======
    public org.xmlsoap.schemas.soap.encoding.UnsignedInt addNewUnsignedInt()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.UnsignedInt target = null;
            target = (org.xmlsoap.schemas.soap.encoding.UnsignedInt)get_store().add_element_user(UNSIGNEDINT$0);
            return target;
        }
    }
}
