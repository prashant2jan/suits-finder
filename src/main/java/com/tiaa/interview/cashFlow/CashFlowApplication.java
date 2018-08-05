package com.tiaa.interview.cashFlow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Cash Flow Management Application
 * JVM parameters required to fire up the app are as follows:
 * 
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class CashFlowApplication 
{
    public static void main( String[] args )
    {
//    	System.setProperty("javax.xml.bind.context.factory","org.eclipse.persistence.jaxb.JAXBContextFactory");
    	SpringApplication.run(CashFlowApplication.class, args);
    }
}
