
/**
 * ImportDownloadServicesSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;
    /**
     *  ImportDownloadServicesSkeletonInterface java skeleton interface for the axisService
     */
    public interface ImportDownloadServicesSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
<<<<<<< HEAD
         * @param importMarketData
         * @throws ImportDownloadFaultException : 
         */

        
        public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketData
        (
          au.edu.unsw.sltf.services.ImportMarketDataDocument importMarketData
         )
=======
                                    * @param importMarketData
             * @throws ImportDownloadFaultException : 
         */

        
                public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketData
                (
                  au.edu.unsw.sltf.services.ImportMarketDataDocument importMarketData
                 )
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
            throws ImportDownloadFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param downloadFile
             * @throws ImportDownloadFaultException : 
         */

        
                public au.edu.unsw.sltf.services.DownloadFileResponseDocument downloadFile
                (
                  au.edu.unsw.sltf.services.DownloadFileDocument downloadFile
                 )
            throws ImportDownloadFaultException;
        
         }
    