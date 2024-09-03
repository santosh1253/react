package com.guru.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student)ap.getBean("obj");
        System.out.println(student.toString());
    }
}
