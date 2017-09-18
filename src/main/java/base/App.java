package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import base.config.ConfigSet;
import base.service.Task;
import base.service.impl.ProcessPersons;

public class App {

	public static void main(String [] args) {
		
		// Load the java configs to inject beans
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(ConfigSet.class);
		
		// context becomes config aware because the class implementations get injected		
		Task task = null;
//		task = ctx.getBean(RunnableTask.class);
//		task = ctx.getBean(CompartorTask.class);
		task = ctx.getBean(ProcessPersons.class);
		
		try {
			task.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}