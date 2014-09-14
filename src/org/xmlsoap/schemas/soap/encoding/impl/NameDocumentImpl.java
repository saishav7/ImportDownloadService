/*
 * An XML document type.
 * Localname: Name
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.NameDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one Name(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.NameDocument
{
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "Name");
    
    
    /**
     * Gets the "Name" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Name getName()
=======
    public org.xmlsoap.schemas.soap.encoding.Name getName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Name target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
<<<<<<< HEAD
    @Override
	public void setName(org.xmlsoap.schemas.soap.encoding.Name name)
=======
    public void setName(org.xmlsoap.schemas.soap.encoding.Name name)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Name target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Name)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Name addNewName()
=======
    public org.xmlsoap.schemas.soap.encoding.Name addNewName()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Name target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Name)get_store().add_element_user(NAME$0);
            return target;
        }
    }
}
