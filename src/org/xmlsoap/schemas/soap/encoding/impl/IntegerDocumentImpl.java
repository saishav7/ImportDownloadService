/*
 * An XML document type.
 * Localname: integer
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.IntegerDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one integer(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class IntegerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.IntegerDocument
{
    
    public IntegerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGER$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "integer");
    
    
    /**
     * Gets the "integer" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Integer getInteger()
=======
    public org.xmlsoap.schemas.soap.encoding.Integer getInteger()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Integer target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Integer)get_store().find_element_user(INTEGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "integer" element
     */
<<<<<<< HEAD
    @Override
	public void setInteger(org.xmlsoap.schemas.soap.encoding.Integer integer)
=======
    public void setInteger(org.xmlsoap.schemas.soap.encoding.Integer integer)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Integer target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Integer)get_store().find_element_user(INTEGER$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Integer)get_store().add_element_user(INTEGER$0);
            }
            target.set(integer);
        }
    }
    
    /**
     * Appends and returns a new empty "integer" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Integer addNewInteger()
=======
    public org.xmlsoap.schemas.soap.encoding.Integer addNewInteger()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Integer target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Integer)get_store().add_element_user(INTEGER$0);
            return target;
        }
    }
}
