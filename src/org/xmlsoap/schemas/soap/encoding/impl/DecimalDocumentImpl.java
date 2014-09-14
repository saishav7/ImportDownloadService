/*
 * An XML document type.
 * Localname: decimal
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.DecimalDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one decimal(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class DecimalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.DecimalDocument
{
    
    public DecimalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMAL$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal");
    
    
    /**
     * Gets the "decimal" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Decimal getDecimal()
=======
    public org.xmlsoap.schemas.soap.encoding.Decimal getDecimal()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(DECIMAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decimal" element
     */
<<<<<<< HEAD
    @Override
	public void setDecimal(org.xmlsoap.schemas.soap.encoding.Decimal decimal)
=======
    public void setDecimal(org.xmlsoap.schemas.soap.encoding.Decimal decimal)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(DECIMAL$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(DECIMAL$0);
            }
            target.set(decimal);
        }
    }
    
    /**
     * Appends and returns a new empty "decimal" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.Decimal addNewDecimal()
=======
    public org.xmlsoap.schemas.soap.encoding.Decimal addNewDecimal()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.Decimal target = null;
            target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(DECIMAL$0);
            return target;
        }
    }
}
