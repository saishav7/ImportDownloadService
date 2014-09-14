/*
 * An XML document type.
 * Localname: hexBinary
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.HexBinaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one hexBinary(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class HexBinaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.HexBinaryDocument
{
    
    public HexBinaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEXBINARY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "hexBinary");
    
    
    /**
     * Gets the "hexBinary" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.HexBinary getHexBinary()
=======
    public org.xmlsoap.schemas.soap.encoding.HexBinary getHexBinary()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.HexBinary target = null;
            target = (org.xmlsoap.schemas.soap.encoding.HexBinary)get_store().find_element_user(HEXBINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hexBinary" element
     */
<<<<<<< HEAD
    @Override
	public void setHexBinary(org.xmlsoap.schemas.soap.encoding.HexBinary hexBinary)
=======
    public void setHexBinary(org.xmlsoap.schemas.soap.encoding.HexBinary hexBinary)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.HexBinary target = null;
            target = (org.xmlsoap.schemas.soap.encoding.HexBinary)get_store().find_element_user(HEXBINARY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.HexBinary)get_store().add_element_user(HEXBINARY$0);
            }
            target.set(hexBinary);
        }
    }
    
    /**
     * Appends and returns a new empty "hexBinary" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.HexBinary addNewHexBinary()
=======
    public org.xmlsoap.schemas.soap.encoding.HexBinary addNewHexBinary()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.HexBinary target = null;
            target = (org.xmlsoap.schemas.soap.encoding.HexBinary)get_store().add_element_user(HEXBINARY$0);
            return target;
        }
    }
}
