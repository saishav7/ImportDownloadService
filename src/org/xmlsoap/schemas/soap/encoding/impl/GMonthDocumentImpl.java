/*
 * An XML document type.
 * Localname: gMonth
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.GMonthDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one gMonth(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class GMonthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.GMonthDocument
{
    
    public GMonthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMONTH$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonth");
    
    
    /**
     * Gets the "gMonth" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.GMonth getGMonth()
=======
    public org.xmlsoap.schemas.soap.encoding.GMonth getGMonth()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonth)get_store().find_element_user(GMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gMonth" element
     */
<<<<<<< HEAD
    @Override
	public void setGMonth(org.xmlsoap.schemas.soap.encoding.GMonth gMonth)
=======
    public void setGMonth(org.xmlsoap.schemas.soap.encoding.GMonth gMonth)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonth)get_store().find_element_user(GMONTH$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.GMonth)get_store().add_element_user(GMONTH$0);
            }
            target.set(gMonth);
        }
    }
    
    /**
     * Appends and returns a new empty "gMonth" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.GMonth addNewGMonth()
=======
    public org.xmlsoap.schemas.soap.encoding.GMonth addNewGMonth()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (org.xmlsoap.schemas.soap.encoding.GMonth)get_store().add_element_user(GMONTH$0);
            return target;
        }
    }
}
