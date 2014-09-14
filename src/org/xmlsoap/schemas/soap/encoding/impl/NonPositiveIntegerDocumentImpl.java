/*
 * An XML document type.
 * Localname: nonPositiveInteger
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.NonPositiveIntegerDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one nonPositiveInteger(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class NonPositiveIntegerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.NonPositiveIntegerDocument
{
    
    public NonPositiveIntegerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONPOSITIVEINTEGER$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "nonPositiveInteger");
    
    
    /**
     * Gets the "nonPositiveInteger" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NonPositiveInteger getNonPositiveInteger()
=======
    public org.xmlsoap.schemas.soap.encoding.NonPositiveInteger getNonPositiveInteger()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NonPositiveInteger target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NonPositiveInteger)get_store().find_element_user(NONPOSITIVEINTEGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nonPositiveInteger" element
     */
<<<<<<< HEAD
    @Override
	public void setNonPositiveInteger(org.xmlsoap.schemas.soap.encoding.NonPositiveInteger nonPositiveInteger)
=======
    public void setNonPositiveInteger(org.xmlsoap.schemas.soap.encoding.NonPositiveInteger nonPositiveInteger)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NonPositiveInteger target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NonPositiveInteger)get_store().find_element_user(NONPOSITIVEINTEGER$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.NonPositiveInteger)get_store().add_element_user(NONPOSITIVEINTEGER$0);
            }
            target.set(nonPositiveInteger);
        }
    }
    
    /**
     * Appends and returns a new empty "nonPositiveInteger" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NonPositiveInteger addNewNonPositiveInteger()
=======
    public org.xmlsoap.schemas.soap.encoding.NonPositiveInteger addNewNonPositiveInteger()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NonPositiveInteger target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NonPositiveInteger)get_store().add_element_user(NONPOSITIVEINTEGER$0);
            return target;
        }
    }
}
