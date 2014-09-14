/*
 * An XML attribute type.
 * Localname: offset
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.OffsetAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one offset(@http://schemas.xmlsoap.org/soap/encoding/) attribute.
 *
 * This is a complex type.
 */
public class OffsetAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.OffsetAttribute
{
    
    public OffsetAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFSET$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "offset");
    
    
    /**
     * Gets the "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getOffset()
=======
    public java.lang.String getOffset()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.ArrayCoordinate xgetOffset()
=======
    public org.xmlsoap.schemas.soap.encoding.ArrayCoordinate xgetOffset()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ArrayCoordinate target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(OFFSET$0);
            return target;
        }
    }
    
    /**
     * True if has "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetOffset()
=======
    public boolean isSetOffset()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFSET$0) != null;
        }
    }
    
    /**
     * Sets the "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public void setOffset(java.lang.String offset)
=======
    public void setOffset(java.lang.String offset)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSET$0);
            }
            target.setStringValue(offset);
        }
    }
    
    /**
     * Sets (as xml) the "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetOffset(org.xmlsoap.schemas.soap.encoding.ArrayCoordinate offset)
=======
    public void xsetOffset(org.xmlsoap.schemas.soap.encoding.ArrayCoordinate offset)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ArrayCoordinate target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(OFFSET$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().add_attribute_user(OFFSET$0);
            }
            target.set(offset);
        }
    }
    
    /**
     * Unsets the "offset" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetOffset()
=======
    public void unsetOffset()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFSET$0);
        }
    }
}
