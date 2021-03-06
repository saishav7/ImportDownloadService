/*
 * An XML document type.
 * Localname: NOTATION
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.NOTATIONDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one NOTATION(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class NOTATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.NOTATIONDocument
{
    
    public NOTATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "NOTATION");
    
    
    /**
     * Gets the "NOTATION" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NOTATION getNOTATION()
=======
    public org.xmlsoap.schemas.soap.encoding.NOTATION getNOTATION()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NOTATION target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NOTATION)get_store().find_element_user(NOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NOTATION" element
     */
<<<<<<< HEAD
    @Override
	public void setNOTATION(org.xmlsoap.schemas.soap.encoding.NOTATION notation)
=======
    public void setNOTATION(org.xmlsoap.schemas.soap.encoding.NOTATION notation)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NOTATION target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NOTATION)get_store().find_element_user(NOTATION$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.NOTATION)get_store().add_element_user(NOTATION$0);
            }
            target.set(notation);
        }
    }
    
    /**
     * Appends and returns a new empty "NOTATION" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NOTATION addNewNOTATION()
=======
    public org.xmlsoap.schemas.soap.encoding.NOTATION addNewNOTATION()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NOTATION target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NOTATION)get_store().add_element_user(NOTATION$0);
            return target;
        }
    }
}
