package com.suits.finder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Cash Flow Management Application
 * JVM parameters required to fire up the application are as follows:
 * 
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.suits.finder" })
public class SuitsFinderApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(new Class<?>[]{ SuitsFinderApplication.class }, args);
    }
}
