
/**
 * ImportDownloadServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;
    /**
     *  ImportDownloadServicesSkeleton java skeleton for the axisService
     */
    public class ImportDownloadServicesSkeleton implements ImportDownloadServicesSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param importMarketData0 
             * @return importMarketDataResponse1 
             * @throws ImportDownloadFaultException 
         */
        
                 public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketData
                  (
                  au.edu.unsw.sltf.services.ImportMarketDataDocument importMarketData0
                  )
            throws ImportDownloadFaultException{
                //TODO : fill this with the necessary business logic
                	 ImportMarketData req = importMarketData0.getImportMarketData();
                     StringBuilder sbf = new StringBuilder();
                     sbf.append("Security Code: ").append(req.getSec()).append("\r\n");
                     sbf.append("Start date: ").append(req.getStartDate()).append("\r\n");
                     sbf.append("End date: ").append(req.getEndDate()).append("\r\n");
                     sbf.append("Data source: ").append(req.getDataSourceURL()).append("\r\n");
                     String returnStr = sbf.toString();

                     ImportMarketDataResponseDocument resDoc = ImportMarketDataResponseDocument.Factory.newInstance();
                     ImportMarketDataResponse res = resDoc.addNewImportMarketDataResponse();
                     res.setReturn(returnStr);

                     return resDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param downloadFile2 
             * @return downloadFileResponse3 
             * @throws ImportDownloadFaultException 
         */
        
                 public au.edu.unsw.sltf.services.DownloadFileResponseDocument downloadFile
                  (
                  au.edu.unsw.sltf.services.DownloadFileDocument downloadFile2
                  )
            throws ImportDownloadFaultException{
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#downloadFile");
        }
     
    }
    