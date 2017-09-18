package base.service.util;

import java.util.List;
import java.util.function.Predicate;

import base.data.Person;

public class PersonLambda {

	public void reachYoungerContacts(List<Person> pl, Predicate<Person> pred){
		for(Person p:pl){
			if (pred.test(p)){
				reachGen("Reaching the younger gen: " ,p);
			}
		}
	}
	
	public void reachMiddleAgeContacts(List<Person> pl, Predicate<Person> pred){
		for(Person p:pl){
			if (pred.test(p)){
				reachGen("Reaching the middle age gen: " ,p);
			}
		}
	}
	
	public void reachOlderContacts(List<Person> pl, Predicate<Person> pred){
		for(Person p:pl){
			if (pred.test(p)){
				reachGen("Reaching the older gen: " ,p);
			}
		}
	}
	
	private void reachGen(String msg, Person p) {		
		System.out.println(msg + p.getGivenName() + 
				", " + p.getSurName() + ", age = " + p.getAge() 
				+ ", phone = " + p.getPhone());		
	}
}
