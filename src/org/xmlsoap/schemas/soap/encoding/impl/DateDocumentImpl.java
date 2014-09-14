/*
 * An XML document type.
 * Localname: date
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.DateDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one date(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class DateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.DateDocument
{
    
    public DateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "date");
    
    
    /**
     * Gets the "date" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Date getDate()
=======
    public org.xmlsoap.schemas.soap.encoding.Date getDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Date target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
<<<<<<< HEAD
    @Override
	public void setDate(org.xmlsoap.schemas.soap.encoding.Date date)
=======
    public void setDate(org.xmlsoap.schemas.soap.encoding.Date date)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Date target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Date addNewDate()
=======
    public org.xmlsoap.schemas.soap.encoding.Date addNewDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Date target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Date)get_store().add_element_user(DATE$0);
            return target;
        }
    }
}
