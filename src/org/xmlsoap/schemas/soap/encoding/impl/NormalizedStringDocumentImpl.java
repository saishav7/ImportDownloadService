/*
 * An XML document type.
 * Localname: normalizedString
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.NormalizedStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one normalizedString(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class NormalizedStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.NormalizedStringDocument
{
    
    public NormalizedStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORMALIZEDSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "normalizedString");
    
    
    /**
     * Gets the "normalizedString" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NormalizedString getNormalizedString()
=======
    public org.xmlsoap.schemas.soap.encoding.NormalizedString getNormalizedString()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NormalizedString target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NormalizedString)get_store().find_element_user(NORMALIZEDSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "normalizedString" element
     */
<<<<<<< HEAD
    @Override
	public void setNormalizedString(org.xmlsoap.schemas.soap.encoding.NormalizedString normalizedString)
=======
    public void setNormalizedString(org.xmlsoap.schemas.soap.encoding.NormalizedString normalizedString)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NormalizedString target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NormalizedString)get_store().find_element_user(NORMALIZEDSTRING$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.NormalizedString)get_store().add_element_user(NORMALIZEDSTRING$0);
            }
            target.set(normalizedString);
        }
    }
    
    /**
     * Appends and returns a new empty "normalizedString" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.NormalizedString addNewNormalizedString()
=======
    public org.xmlsoap.schemas.soap.encoding.NormalizedString addNewNormalizedString()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.NormalizedString target = null;
            target = (org.xmlsoap.schemas.soap.encoding.NormalizedString)get_store().add_element_user(NORMALIZEDSTRING$0);
            return target;
        }
    }
}
