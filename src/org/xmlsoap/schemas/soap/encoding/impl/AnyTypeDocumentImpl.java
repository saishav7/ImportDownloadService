/*
 * An XML document type.
 * Localname: anyType
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.AnyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one anyType(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class AnyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.AnyTypeDocument
{
    
    public AnyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "anyType");
    
    
    /**
     * Gets the "anyType" element
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlObject getAnyType()
=======
    public org.apache.xmlbeans.XmlObject getAnyType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anyType" element
     */
<<<<<<< HEAD
    @Override
	public void setAnyType(org.apache.xmlbeans.XmlObject anyType)
=======
    public void setAnyType(org.apache.xmlbeans.XmlObject anyType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ANYTYPE$0);
            }
            target.set(anyType);
        }
    }
    
    /**
     * Appends and returns a new empty "anyType" element
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlObject addNewAnyType()
=======
    public org.apache.xmlbeans.XmlObject addNewAnyType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ANYTYPE$0);
            return target;
        }
    }
}
