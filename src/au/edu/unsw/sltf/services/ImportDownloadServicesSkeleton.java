
/**
 * ImportDownloadServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;
    /**
     *  ImportDownloadServicesSkeleton java skeleton for the axisService
     */
    public class ImportDownloadServicesSkeleton implements ImportDownloadServicesSkeletonInterface{
        
        private String resourcesFolder = System.getProperty("catalina.home") + "/webapps/ROOT/cs9322ass1/";
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
                	 ImportMarketData data = importMarketData0.getImportMarketData();
                     
                	 String csvString = URLtoCSV
                             .parseURL(data.getSec(), data.getStartDate(),
                                     data.getEndDate(), data.getDataSourceURL());
                	 
                     System.out.println("getProperty = " + resourcesFolder);
                     
                     File directory = new File(resourcesFolder);
                     
                     Random rand = new Random();
                     int  fileName = rand.nextInt(1000000) + 1;
                     
                     File outputFile = new File(resourcesFolder + "/" + fileName);
                     while (outputFile.exists()) {
                    	 fileName = rand.nextInt(1000000) + 1;
                         outputFile = new File(resourcesFolder + "/" + fileName);
                     }
                     try {
                         FileUtils.writeStringToFile(outputFile, csvString);
                     } catch (IOException e) {
                         // TODO Auto-generated catch block
                         e.printStackTrace();
                     }
                     ImportMarketDataResponseDocument respDoc = ImportMarketDataResponseDocument.Factory.newInstance();
                     ImportMarketDataResponse resp = respDoc.addNewImportMarketDataResponse();
                     resp.setEventSetId(Integer.toString(fileName));
                     respDoc.setImportMarketDataResponse(resp);
                     return respDoc;
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
                	 DownloadFile dfreq = downloadFile2.getDownloadFile();
                     
                     String returnStr = "EventSet Id: " + dfreq.getEventSetId();

                     String url = resourcesFolder + "/" + returnStr;
                     File f = new File(url);

                     DownloadFileResponseDocument dfrespdoc = DownloadFileResponseDocument.Factory.newInstance();
                     DownloadFileResponse dfresp = dfrespdoc.addNewDownloadFileResponse();
                     if (f.exists()) {
                         dfresp.setDataURL(url);
                     } else {
                         //does not exist
                     }
                      
                     return dfrespdoc;
        }
     
    }
    