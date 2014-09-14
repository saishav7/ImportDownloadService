/*
 * XML Type:  Array
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.Array
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * An XML Array(@http://schemas.xmlsoap.org/soap/encoding/).
 *
 * This is a complex type.
 */
public class ArrayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.Array
{
    
    public ArrayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "arrayType");
    private static final javax.xml.namespace.QName OFFSET$2 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "offset");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName HREF$6 = 
        new javax.xml.namespace.QName("", "href");
    
    
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$2);
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
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(OFFSET$2);
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
            return get_store().find_attribute_user(OFFSET$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSET$2);
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
            target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().find_attribute_user(OFFSET$2);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.ArrayCoordinate)get_store().add_attribute_user(OFFSET$2);
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
            get_store().remove_attribute(OFFSET$2);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getId()
=======
    public java.lang.String getId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlID xgetId()
=======
    public org.apache.xmlbeans.XmlID xgetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetId()
=======
    public boolean isSetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void setId(java.lang.String id)
=======
    public void setId(java.lang.String id)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetId(org.apache.xmlbeans.XmlID id)
=======
    public void xsetId(org.apache.xmlbeans.XmlID id)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetId()
=======
    public void unsetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public java.lang.String getHref()
=======
    public java.lang.String getHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public org.apache.xmlbeans.XmlAnyURI xgetHref()
=======
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$6);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
<<<<<<< HEAD
    @Override
	public boolean isSetHref()
=======
    public boolean isSetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$6) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void setHref(java.lang.String href)
=======
    public void setHref(java.lang.String href)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$6);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
=======
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$6);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
<<<<<<< HEAD
    @Override
	public void unsetHref()
=======
    public void unsetHref()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$6);
        }
    }
}
