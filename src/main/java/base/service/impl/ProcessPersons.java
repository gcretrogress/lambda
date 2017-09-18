package base.service.impl;

import java.util.List;
import java.util.function.Predicate;

import base.data.Gender;
import base.data.Person;
import base.service.Task;
import base.service.util.PersonLambda;

public class ProcessPersons implements Task {

	@Override
	public void execute() throws Exception {
		
		System.out.println("=====Process persons Test=======");
		
		List<Person> personList = Person.createShortList();
		PersonLambda pLamb = new PersonLambda();
		
		for(Person p:personList) {
			p.printName();
		}
		
		// Predicates
		Predicate<Person> allPeople  = ppl -> ppl.getAge() >= 16;
		Predicate<Person> allYounger = ppl -> ppl.getAge() >= 18 && ppl.getAge() <= 29 && ppl.getGender() == Gender.MALE;
		Predicate<Person> allOlder   = p   -> p.getAge() >= 28 && p.getAge() <=65;
		
		// Execute the task
		System.out.println("============Processing the generation=============");
		pLamb.reachYoungerContacts(personList, allYounger);
		System.out.println("=============Finished processing the generation==========");
		System.out.println("============Processing the generation=============");
		pLamb.reachMiddleAgeContacts(personList, allPeople);
		System.out.println("=============Finished processing the generation==========");
		System.out.println("============Processing the generation=============");
		pLamb.reachOlderContacts(personList, allOlder);
		System.out.println("=============Finished processing the generation==========");
	}
}
