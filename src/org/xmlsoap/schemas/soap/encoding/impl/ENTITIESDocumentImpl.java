/*
 * An XML document type.
 * Localname: ENTITIES
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: org.xmlsoap.schemas.soap.encoding.ENTITIESDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one ENTITIES(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class ENTITIESDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.encoding.ENTITIESDocument
{
    
    public ENTITIESDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITIES$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "ENTITIES");
    
    
    /**
     * Gets the "ENTITIES" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.ENTITIES getENTITIES()
=======
    public org.xmlsoap.schemas.soap.encoding.ENTITIES getENTITIES()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ENTITIES target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ENTITIES" element
     */
<<<<<<< HEAD
    @Override
	public void setENTITIES(org.xmlsoap.schemas.soap.encoding.ENTITIES entities)
=======
    public void setENTITIES(org.xmlsoap.schemas.soap.encoding.ENTITIES entities)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ENTITIES target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().add_element_user(ENTITIES$0);
            }
            target.set(entities);
        }
    }
    
    /**
     * Appends and returns a new empty "ENTITIES" element
     */
<<<<<<< HEAD
    @Override
	public org.xmlsoap.schemas.soap.encoding.ENTITIES addNewENTITIES()
=======
    public org.xmlsoap.schemas.soap.encoding.ENTITIES addNewENTITIES()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.ENTITIES target = null;
            target = (org.xmlsoap.schemas.soap.encoding.ENTITIES)get_store().add_element_user(ENTITIES$0);
            return target;
        }
    }
}
