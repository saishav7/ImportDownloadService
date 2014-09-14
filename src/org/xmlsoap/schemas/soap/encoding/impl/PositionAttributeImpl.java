/*
 * An XML attribute type.
 * Localname: position
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.PositionAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one position(@http://schemas.xmlsoap.org/soap/encoding/) attribute.
 *
 * This is a complex type.
 */
public class PositionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.PositionAttribute
{
    
    public PositionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "position");
    
    
    /**
     * Gets the "position" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getPosition()
=======
    public java.lang.String getPosition()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.ArrayCoordinate xgetPosition()
=======
    public org.xmlsoap.schemas.soap.encoding.ArrayCoordinate xgetPosition()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ArrayCoordinate target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(POSITION$0);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetPosition()
=======
    public boolean isSetPosition()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$0) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
<<<<<<< HEAD
    @Override
	public void setPosition(java.lang.String position)
=======
    public void setPosition(java.lang.String position)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$0);
            }
            target.setStringValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetPosition(org.xmlsoap.schemas.soap.encoding.ArrayCoordinate position)
=======
    public void xsetPosition(org.xmlsoap.schemas.soap.encoding.ArrayCoordinate position)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ArrayCoordinate target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().add_attribute_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetPosition()
=======
    public void unsetPosition()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$0);
        }
    }
}
