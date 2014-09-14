/*
 * An XML document type.
 * Localname: importDownloadFault
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.ImportDownloadFaultDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one importDownloadFault(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class ImportDownloadFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportDownloadFaultDocument
{
    
    public ImportDownloadFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTDOWNLOADFAULT$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "importDownloadFault");
    
    
    /**
     * Gets the "importDownloadFault" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault getImportDownloadFault()
=======
    public au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault getImportDownloadFault()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault target = null;
            target = (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault)get_store().find_element_user(IMPORTDOWNLOADFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "importDownloadFault" element
     */
<<<<<<< HEAD
    @Override
	public void setImportDownloadFault(au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault importDownloadFault)
=======
    public void setImportDownloadFault(au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault importDownloadFault)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault target = null;
            target = (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault)get_store().find_element_user(IMPORTDOWNLOADFAULT$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault)get_store().add_element_user(IMPORTDOWNLOADFAULT$0);
            }
            target.set(importDownloadFault);
        }
    }
    
    /**
     * Appends and returns a new empty "importDownloadFault" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault addNewImportDownloadFault()
=======
    public au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault addNewImportDownloadFault()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault target = null;
            target = (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault)get_store().add_element_user(IMPORTDOWNLOADFAULT$0);
            return target;
        }
    }
    /**
     * An XML importDownloadFault(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class ImportDownloadFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault
    {
        
        public ImportDownloadFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAULTTYPE$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "faultType");
        private static final javax.xml.namespace.QName FAULTMESSAGE$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "faultMessage");
        
        
        /**
         * Gets the "faultType" element
         */
<<<<<<< HEAD
        @Override
		public au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum getFaultType()
=======
        public au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum getFaultType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "faultType" element
         */
<<<<<<< HEAD
        @Override
		public au.edu.unsw.sltf.services.ImportDownloadFaultType xgetFaultType()
=======
        public au.edu.unsw.sltf.services.ImportDownloadFaultType xgetFaultType()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.edu.unsw.sltf.services.ImportDownloadFaultType target = null;
                target = (au.edu.unsw.sltf.services.ImportDownloadFaultType)get_store().find_element_user(FAULTTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "faultType" element
         */
<<<<<<< HEAD
        @Override
		public void setFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType)
=======
        public void setFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTTYPE$0);
                }
                target.setEnumValue(faultType);
            }
        }
        
        /**
         * Sets (as xml) the "faultType" element
         */
<<<<<<< HEAD
        @Override
		public void xsetFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType faultType)
=======
        public void xsetFaultType(au.edu.unsw.sltf.services.ImportDownloadFaultType faultType)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.edu.unsw.sltf.services.ImportDownloadFaultType target = null;
                target = (au.edu.unsw.sltf.services.ImportDownloadFaultType)get_store().find_element_user(FAULTTYPE$0, 0);
                if (target == null)
                {
                    target = (au.edu.unsw.sltf.services.ImportDownloadFaultType)get_store().add_element_user(FAULTTYPE$0);
                }
                target.set(faultType);
            }
        }
        
        /**
         * Gets the "faultMessage" element
         */
<<<<<<< HEAD
        @Override
		public java.lang.String getFaultMessage()
=======
        public java.lang.String getFaultMessage()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTMESSAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "faultMessage" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlString xgetFaultMessage()
=======
        public org.apache.xmlbeans.XmlString xgetFaultMessage()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTMESSAGE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "faultMessage" element
         */
<<<<<<< HEAD
        @Override
		public void setFaultMessage(java.lang.String faultMessage)
=======
        public void setFaultMessage(java.lang.String faultMessage)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTMESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTMESSAGE$2);
                }
                target.setStringValue(faultMessage);
            }
        }
        
        /**
         * Sets (as xml) the "faultMessage" element
         */
<<<<<<< HEAD
        @Override
		public void xsetFaultMessage(org.apache.xmlbeans.XmlString faultMessage)
=======
        public void xsetFaultMessage(org.apache.xmlbeans.XmlString faultMessage)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTMESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTMESSAGE$2);
                }
                target.set(faultMessage);
            }
        }
    }
}
