/*
 * An XML document type.
 * Localname: downloadFile
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.DownloadFileDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one downloadFile(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class DownloadFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileDocument
{
    
    public DownloadFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOWNLOADFILE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "downloadFile");
    
    
    /**
     * Gets the "downloadFile" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile getDownloadFile()
=======
    public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile getDownloadFile()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().find_element_user(DOWNLOADFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "downloadFile" element
     */
<<<<<<< HEAD
    @Override
	public void setDownloadFile(au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile downloadFile)
=======
    public void setDownloadFile(au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile downloadFile)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().find_element_user(DOWNLOADFILE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().add_element_user(DOWNLOADFILE$0);
            }
            target.set(downloadFile);
        }
    }
    
    /**
     * Appends and returns a new empty "downloadFile" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile addNewDownloadFile()
=======
    public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile addNewDownloadFile()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().add_element_user(DOWNLOADFILE$0);
            return target;
        }
    }
    /**
     * An XML downloadFile(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class DownloadFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile
    {
        
        public DownloadFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        
        
        /**
         * Gets the "eventSetId" element
         */
<<<<<<< HEAD
        @Override
		public java.lang.String getEventSetId()
=======
        public java.lang.String getEventSetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlString xgetEventSetId()
=======
        public org.apache.xmlbeans.XmlString xgetEventSetId()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventSetId" element
         */
<<<<<<< HEAD
        @Override
		public void setEventSetId(java.lang.String eventSetId)
=======
        public void setEventSetId(java.lang.String eventSetId)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSETID$0);
                }
                target.setStringValue(eventSetId);
            }
        }
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
<<<<<<< HEAD
        @Override
		public void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId)
=======
        public void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSETID$0);
                }
                target.set(eventSetId);
            }
        }
    }
}
