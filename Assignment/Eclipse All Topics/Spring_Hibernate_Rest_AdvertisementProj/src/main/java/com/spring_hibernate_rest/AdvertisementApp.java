package com.spring_hibernate_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@ImportResource("advertise_app_config.xml")
public class AdvertisementApp 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AdvertisementApp.class, args);
    	
    }
}
