package base.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import base.data.Person;
import base.service.Task;

public class CompartorTask implements Task {
	
	public void execute() throws Exception {
		
		System.out.println("=====Comparator Test=======");
		
		List<Person> personList = Person.createShortList();
		
		for(Person p:personList) {
			p.printName();
		}
		
		// Sort with inner class
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		
		System.out.println("========Sorted Asc SurName=========");
		for(Person p:personList) {
			p.printName();
		}
		
		// Use Lambda expression
		System.out.println("========= Sorted Asc SurName ===============");
		Collections.sort(personList, 
				(Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
		
		for(Person p:personList) {
			p.printName();
		}
		
		// print desc
		System.out.println("========= Sorted desc SurName ===============");
		Collections.sort(personList, 
				(p1,p2) -> p2.getSurName().compareTo(p1.getSurName()));
		
		for(Person p:personList) {
			p.printName();
		}
	}
}


































