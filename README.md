# sap-cloud-starter-spring-boot
Starter project that uses spring boot 

A basic spring boot starter project that can be deployed onto SAP Cloud. There are two profiles local and cloud that provides the relevant settings. 

Note: SLF4J needs to be declared as provided in the cloud profile, since Tomcat on SAP Cloud includes SLF4J as its logging framework. 

Usage:

To generate a war to test locally use: 
mvn -P local clean install package

To generate a war that can be deployed as a Java Application to SAP Cloud use: 
mvn -P cloud clean install package

Deploy the war as a Java Application on to the SAP Cloud platform. 

To test navigate to 

http://app-base-url/home 


