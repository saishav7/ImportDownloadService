/*
 * An XML document type.
 * Localname: IDREFS
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.IDREFSDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one IDREFS(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class IDREFSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.IDREFSDocument
{
    
    public IDREFSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDREFS$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "IDREFS");
    
    
    /**
     * Gets the "IDREFS" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.IDREFS getIDREFS()
=======
    public org.xmlsoap.schemas.soap.encoding.IDREFS getIDREFS()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.IDREFS target = null;
            target = (org.xmlsoap.schemas.soap.encoding.IDREFS)get_store().find_element_user(IDREFS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IDREFS" element
     */
<<<<<<< HEAD
    @Override
	public void setIDREFS(org.xmlsoap.schemas.soap.encoding.IDREFS idrefs)
=======
    public void setIDREFS(org.xmlsoap.schemas.soap.encoding.IDREFS idrefs)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.IDREFS target = null;
            target = (org.xmlsoap.schemas.soap.encoding.IDREFS)get_store().find_element_user(IDREFS$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.IDREFS)get_store().add_element_user(IDREFS$0);
            }
            target.set(idrefs);
        }
    }
    
    /**
     * Appends and returns a new empty "IDREFS" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.IDREFS addNewIDREFS()
=======
    public org.xmlsoap.schemas.soap.encoding.IDREFS addNewIDREFS()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.IDREFS target = null;
            target = (org.xmlsoap.schemas.soap.encoding.IDREFS)get_store().add_element_user(IDREFS$0);
            return target;
        }
    }
}
