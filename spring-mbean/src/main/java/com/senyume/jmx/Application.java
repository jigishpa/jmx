package com.senyume.jmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;

/**
 * @author Jigish Patel
 */

@EnableAutoConfiguration
@ComponentScan
@EnableMBeanExport
public class Application {
	
	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
	}
}
