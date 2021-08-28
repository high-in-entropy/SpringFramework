package springmvc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContext {
	
	
	public ApplicationContext getContext() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		return context;
		
	}
	
	

}
