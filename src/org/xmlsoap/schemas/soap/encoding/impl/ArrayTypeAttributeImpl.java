/*
 * An XML attribute type.
 * Localname: arrayType
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.ArrayTypeAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one arrayType(@http://schemas.xmlsoap.org/soap/encoding/) attribute.
 *
 * This is a complex type.
 */
public class ArrayTypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.ArrayTypeAttribute
{
    
    public ArrayTypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "arrayType");
    
    
    /**
     * Gets the "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getArrayType()
=======
    public java.lang.String getArrayType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlString xgetArrayType()
=======
    public org.apache.xmlbeans.XmlString xgetArrayType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARRAYTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetArrayType()
=======
    public boolean isSetArrayType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARRAYTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public void setArrayType(java.lang.String arrayType)
=======
    public void setArrayType(java.lang.String arrayType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRAYTYPE$0);
            }
            target.setStringValue(arrayType);
        }
    }
    
    /**
     * Sets (as xml) the "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetArrayType(org.apache.xmlbeans.XmlString arrayType)
=======
    public void xsetArrayType(org.apache.xmlbeans.XmlString arrayType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARRAYTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARRAYTYPE$0);
            }
            target.set(arrayType);
        }
    }
    
    /**
     * Unsets the "arrayType" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetArrayType()
=======
    public void unsetArrayType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARRAYTYPE$0);
        }
    }
}
