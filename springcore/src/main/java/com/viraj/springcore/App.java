package com.viraj.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*
		 * You did not define objects explicitly anywhere, it was all done by IOC
		 * Container of which ApplicationContext is an interface.
		 */
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("==========INJECTING PRIMITIVE TYPE================\n");
        System.out.println(context.getBean("student2"));
        System.out.println(context.getBean("student1") + "\n");
        System.out.println("==========INJECTING COLLECTIONS TYPE================\n");
        System.out.println(context.getBean("employee1") + "\n");
        System.out.println("==========INJECTING REFERENCE TYPE==================\n");
        System.out.println(context.getBean("BRef"));
        System.out.println(context.getBean("ARef"));
    }
}
