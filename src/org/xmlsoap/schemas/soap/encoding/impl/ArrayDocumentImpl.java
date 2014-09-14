/*
 * An XML document type.
 * Localname: Array
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one Array(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.ArrayDocument
{
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Array");
    
    
    /**
     * Gets the "Array" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Array getArray()
=======
    public org.xmlsoap.schemas.soap.encoding.Array getArray()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Array target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Array" element
     */
<<<<<<< HEAD
    @Override
	public void setArray(org.xmlsoap.schemas.soap.encoding.Array array)
=======
    public void setArray(org.xmlsoap.schemas.soap.encoding.Array array)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Array target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Array)get_store().add_element_user(ARRAY$0);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "Array" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Array addNewArray()
=======
    public org.xmlsoap.schemas.soap.encoding.Array addNewArray()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Array target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Array)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
}
