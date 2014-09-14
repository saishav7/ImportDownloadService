/*
 * An XML document type.
 * Localname: gMonthDay
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.GMonthDayDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one gMonthDay(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class GMonthDayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.GMonthDayDocument
{
    
    public GMonthDayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMONTHDAY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonthDay");
    
    
    /**
     * Gets the "gMonthDay" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.GMonthDay getGMonthDay()
=======
    public org.xmlsoap.schemas.soap.encoding.GMonthDay getGMonthDay()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonthDay target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonthDay)get_store().find_element_user(GMONTHDAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gMonthDay" element
     */
<<<<<<< HEAD
    @Override
	public void setGMonthDay(org.xmlsoap.schemas.soap.encoding.GMonthDay gMonthDay)
=======
    public void setGMonthDay(org.xmlsoap.schemas.soap.encoding.GMonthDay gMonthDay)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonthDay target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonthDay)get_store().find_element_user(GMONTHDAY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.GMonthDay)get_store().add_element_user(GMONTHDAY$0);
            }
            target.set(gMonthDay);
        }
    }
    
    /**
     * Appends and returns a new empty "gMonthDay" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.GMonthDay addNewGMonthDay()
=======
    public org.xmlsoap.schemas.soap.encoding.GMonthDay addNewGMonthDay()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonthDay target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonthDay)get_store().add_element_user(GMONTHDAY$0);
            return target;
        }
    }
}
