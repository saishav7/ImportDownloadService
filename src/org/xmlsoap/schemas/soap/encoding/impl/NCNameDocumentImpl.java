/*
 * An XML document type.
 * Localname: NCName
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.NCNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one NCName(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class NCNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.NCNameDocument
{
    
    public NCNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NCName");
    
    
    /**
     * Gets the "NCName" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NCName getNCName()
=======
    public org.xmlsoap.schemas.soap.encoding.NCName getNCName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NCName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NCName)get_store().find_element_user(NCNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NCName" element
     */
<<<<<<< HEAD
    @Override
	public void setNCName(org.xmlsoap.schemas.soap.encoding.NCName ncName)
=======
    public void setNCName(org.xmlsoap.schemas.soap.encoding.NCName ncName)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NCName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NCName)get_store().find_element_user(NCNAME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.NCName)get_store().add_element_user(NCNAME$0);
            }
            target.set(ncName);
        }
    }
    
    /**
     * Appends and returns a new empty "NCName" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NCName addNewNCName()
=======
    public org.xmlsoap.schemas.soap.encoding.NCName addNewNCName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NCName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NCName)get_store().add_element_user(NCNAME$0);
            return target;
        }
    }
}
