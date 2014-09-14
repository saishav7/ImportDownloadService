/*
 * An XML document type.
 * Localname: Struct
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.StructDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one Struct(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class StructDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.StructDocument
{
    
    public StructDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Struct");
    
    
    /**
     * Gets the "Struct" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Struct getStruct()
=======
    public org.xmlsoap.schemas.soap.encoding.Struct getStruct()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Struct target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Struct)get_store().find_element_user(STRUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Struct" element
     */
<<<<<<< HEAD
    @Override
	public void setStruct(org.xmlsoap.schemas.soap.encoding.Struct struct)
=======
    public void setStruct(org.xmlsoap.schemas.soap.encoding.Struct struct)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Struct target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Struct)get_store().find_element_user(STRUCT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Struct)get_store().add_element_user(STRUCT$0);
            }
            target.set(struct);
        }
    }
    
    /**
     * Appends and returns a new empty "Struct" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Struct addNewStruct()
=======
    public org.xmlsoap.schemas.soap.encoding.Struct addNewStruct()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Struct target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Struct)get_store().add_element_user(STRUCT$0);
            return target;
        }
    }
}
