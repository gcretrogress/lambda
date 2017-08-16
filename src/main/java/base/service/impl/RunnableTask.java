package base.service.impl;

import base.service.Task;

public class RunnableTask implements Task {
	
	public void execute() throws Exception {
		
		System.out.println("=====Runnable Test=======");
		
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			 @Override
			 public void run() {
				 System.out.println("Hello world one!");
			 }
		};
		
		// Lambda runnable
		Runnable r2 = () -> System.out.println("Hello world two!");
		
		r1.run();
		r2.run();
		
	}
}
