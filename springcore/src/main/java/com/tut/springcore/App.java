package com.tut.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Sumsung s7 = factory.getBean(Sumsung.class);
        s7.config();
    }
}
