package com.viraj.autowire.inline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Autowired can be implmented atop variable or setter or 
 * constructor.
 */
public class AutowireApp 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*
		 * You did not define objects explicitly anywhere, it was all done by IOC
		 * Container of which ApplicationContext is an interface.
		 */
        ApplicationContext context = new ClassPathXmlApplicationContext("com/viraj/autowire/inline/autowireConfig.xml");
        System.out.println("==========INJECTING Objects by Autowiring byName================\n");
        System.out.println(context.getBean("emp1"));
    }
}
