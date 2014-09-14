/*
 * An XML document type.
 * Localname: importMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.ImportMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one importMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class ImportMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument
{
    
    public ImportMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "importMarketData");
    
    
    /**
     * Gets the "importMarketData" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData getImportMarketData()
=======
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData getImportMarketData()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "importMarketData" element
     */
<<<<<<< HEAD
    @Override
	public void setImportMarketData(au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData importMarketData)
=======
    public void setImportMarketData(au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData importMarketData)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            }
            target.set(importMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "importMarketData" element
     */
<<<<<<< HEAD
    @Override
	public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData addNewImportMarketData()
=======
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData addNewImportMarketData()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML importMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class ImportMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData
    {
        
        public ImportMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEC$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "sec");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "endDate");
        private static final javax.xml.namespace.QName DATASOURCEURL$6 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "dataSourceURL");
        
        
        /**
         * Gets the "sec" element
         */
<<<<<<< HEAD
        @Override
		public java.lang.String getSec()
=======
        public java.lang.String getSec()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sec" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlString xgetSec()
=======
        public org.apache.xmlbeans.XmlString xgetSec()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sec" element
         */
<<<<<<< HEAD
        @Override
		public void setSec(java.lang.String sec)
=======
        public void setSec(java.lang.String sec)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEC$0);
                }
                target.setStringValue(sec);
            }
        }
        
        /**
         * Sets (as xml) the "sec" element
         */
<<<<<<< HEAD
        @Override
		public void xsetSec(org.apache.xmlbeans.XmlString sec)
=======
        public void xsetSec(org.apache.xmlbeans.XmlString sec)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEC$0);
                }
                target.set(sec);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
<<<<<<< HEAD
        @Override
		public java.util.Calendar getStartDate()
=======
        public java.util.Calendar getStartDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlDateTime xgetStartDate()
=======
        public org.apache.xmlbeans.XmlDateTime xgetStartDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
<<<<<<< HEAD
        @Override
		public void setStartDate(java.util.Calendar startDate)
=======
        public void setStartDate(java.util.Calendar startDate)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
<<<<<<< HEAD
        @Override
		public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
=======
        public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATE$2);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
<<<<<<< HEAD
        @Override
		public java.util.Calendar getEndDate()
=======
        public java.util.Calendar getEndDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlDateTime xgetEndDate()
=======
        public org.apache.xmlbeans.XmlDateTime xgetEndDate()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
<<<<<<< HEAD
        @Override
		public void setEndDate(java.util.Calendar endDate)
=======
        public void setEndDate(java.util.Calendar endDate)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
<<<<<<< HEAD
        @Override
		public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
=======
        public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "dataSourceURL" element
         */
<<<<<<< HEAD
        @Override
		public java.lang.String getDataSourceURL()
=======
        public java.lang.String getDataSourceURL()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSourceURL" element
         */
<<<<<<< HEAD
        @Override
		public org.apache.xmlbeans.XmlAnyURI xgetDataSourceURL()
=======
        public org.apache.xmlbeans.XmlAnyURI xgetDataSourceURL()
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATASOURCEURL$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSourceURL" element
         */
<<<<<<< HEAD
        @Override
		public void setDataSourceURL(java.lang.String dataSourceURL)
=======
        public void setDataSourceURL(java.lang.String dataSourceURL)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCEURL$6);
                }
                target.setStringValue(dataSourceURL);
            }
        }
        
        /**
         * Sets (as xml) the "dataSourceURL" element
         */
<<<<<<< HEAD
        @Override
		public void xsetDataSourceURL(org.apache.xmlbeans.XmlAnyURI dataSourceURL)
=======
        public void xsetDataSourceURL(org.apache.xmlbeans.XmlAnyURI dataSourceURL)
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATASOURCEURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DATASOURCEURL$6);
                }
                target.set(dataSourceURL);
            }
        }
    }
}
