/*
 * An XML document type.
 * Localname: QName
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.QNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one QName(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class QNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.QNameDocument
{
    
    public QNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "QName");
    
    
    /**
     * Gets the "QName" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.QName getQName()
=======
    public org.xmlsoap.schemas.soap.encoding.QName getQName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.QName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.QName)get_store().find_element_user(QNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QName" element
     */
<<<<<<< HEAD
    @Override
	public void setQName(org.xmlsoap.schemas.soap.encoding.QName qName)
=======
    public void setQName(org.xmlsoap.schemas.soap.encoding.QName qName)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.QName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.QName)get_store().find_element_user(QNAME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.QName)get_store().add_element_user(QNAME$0);
            }
            target.set(qName);
        }
    }
    
    /**
     * Appends and returns a new empty "QName" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.QName addNewQName()
=======
    public org.xmlsoap.schemas.soap.encoding.QName addNewQName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.QName target = null;
            target = (org.xmlsoap.schemas.soap.encoding.QName)get_store().add_element_user(QNAME$0);
            return target;
        }
    }
}
