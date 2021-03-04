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
@EnableAutoConfiguration
public class CashFlowApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CashFlowApplication.class, args);
//    	createMatchingFiles();
    }

//	private static void createMatchingFiles() {
//		CmFoodChainResponse response = new CmFoodChainResponse();
//	}
//
//	private static String getBranches() {
//		final String uri = "http://localhost:8080/branch";
//
//	    RestTemplate restTemplate = new RestTemplate();
//	    String result = restTemplate.getForObject(uri, String.class);
//	    return result;
//	}
}
