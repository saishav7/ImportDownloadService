
/**
 * ImportDownloadFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package au.edu.unsw.sltf.services;

public class ImportDownloadFaultException extends java.lang.Exception{

<<<<<<< HEAD
    private static final long serialVersionUID = 1410337250694L;
=======
    private static final long serialVersionUID = 1410595915723L;
>>>>>>> 879924f9006732dfac0289a1b05d78b9f43c0c85
    
    private au.edu.unsw.sltf.services.ImportDownloadFaultDocument faultMessage;

    
        public ImportDownloadFaultException() {
            super("ImportDownloadFaultException");
        }

        public ImportDownloadFaultException(java.lang.String s) {
           super(s);
        }

        public ImportDownloadFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ImportDownloadFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(au.edu.unsw.sltf.services.ImportDownloadFaultDocument msg){
       faultMessage = msg;
    }
    
    public au.edu.unsw.sltf.services.ImportDownloadFaultDocument getFaultMessage(){
       return faultMessage;
    }
}
    