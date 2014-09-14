/*
 * An XML document type.
 * Localname: time
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.TimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one time(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class TimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.TimeDocument
{
    
    public TimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIME$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "time");
    
    
    /**
     * Gets the "time" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Time getTime()
=======
    public org.xmlsoap.schemas.soap.encoding.Time getTime()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Time target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Time)get_store().find_element_user(TIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "time" element
     */
<<<<<<< HEAD
    @Override
	public void setTime(org.xmlsoap.schemas.soap.encoding.Time time)
=======
    public void setTime(org.xmlsoap.schemas.soap.encoding.Time time)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Time target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Time)get_store().find_element_user(TIME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Time)get_store().add_element_user(TIME$0);
            }
            target.set(time);
        }
    }
    
    /**
     * Appends and returns a new empty "time" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Time addNewTime()
=======
    public org.xmlsoap.schemas.soap.encoding.Time addNewTime()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Time target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Time)get_store().add_element_user(TIME$0);
            return target;
        }
    }
}
