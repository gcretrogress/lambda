package base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import base.service.Task;
import base.service.impl.CompartorTask;
import base.service.impl.ProcessPersons;
import base.service.impl.RunnableTask;

@Configuration
@ComponentScan({"base.config", "base.service"}) // scan the packages
@PropertySource("classpath:config.properties") // scan the properties
@ImportResource("applicationContext.xml") // This would import an xml file
public class ConfigSet {

	/*
	 * For beans which are not autowired.	
	*/
	@Bean
	public Task runnableTask() {
		return new RunnableTask();
	}
	@Bean
	public Task comparatorTask() {
		return new CompartorTask();
	}
	@Bean
	public Task processPersonsTask() {
		return new ProcessPersons();
	}
}
