/*
 * An XML document type.
 * Localname: downloadFileResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.DownloadFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one downloadFileResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class DownloadFileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileResponseDocument
{
    
    public DownloadFileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOWNLOADFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "downloadFileResponse");
    
    
    /**
     * Gets the "downloadFileResponse" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse getDownloadFileResponse()
=======
    public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse getDownloadFileResponse()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().find_element_user(DOWNLOADFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "downloadFileResponse" element
     */
<<<<<<< HEAD
    @Override
	public void setDownloadFileResponse(au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse downloadFileResponse)
=======
    public void setDownloadFileResponse(au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse downloadFileResponse)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().find_element_user(DOWNLOADFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().add_element_user(DOWNLOADFILERESPONSE$0);
            }
            target.set(downloadFileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "downloadFileResponse" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse addNewDownloadFileResponse()
=======
    public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse addNewDownloadFileResponse()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().add_element_user(DOWNLOADFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML downloadFileResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class DownloadFileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse
    {
        
        public DownloadFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAURL$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "dataURL");
        
        
        /**
         * Gets the "dataURL" element
         */
<<<<<<< HEAD
        @Override
		public java.lang.String getDataURL()
=======
        public java.lang.String getDataURL()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataURL" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlAnyURI xgetDataURL()
=======
        public org.apache.xmlbeans.XmlAnyURI xgetDataURL()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataURL" element
         */
<<<<<<< HEAD
        @Override
		public void setDataURL(java.lang.String dataURL)
=======
        public void setDataURL(java.lang.String dataURL)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAURL$0);
                }
                target.setStringValue(dataURL);
            }
        }
        
        /**
         * Sets (as xml) the "dataURL" element
         */
<<<<<<< HEAD
        @Override
		public void xsetDataURL(org.apache.xmlbeans.XmlAnyURI dataURL)
=======
        public void xsetDataURL(org.apache.xmlbeans.XmlAnyURI dataURL)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DATAURL$0);
                }
                target.set(dataURL);
            }
        }
    }
}
