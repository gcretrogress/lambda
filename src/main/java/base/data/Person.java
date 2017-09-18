package base.data;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String givenName;
	private String surName;
	private int age;
	private Gender gender;
	private String email;
	private String phone;
	private String address;
	
	public Person(String givenName,
			      String surName,
			      int age,
			      Gender gender,
			      String email,
			      String phone,
			      String address) {
		this.givenName = givenName;
		this.surName = surName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public void printName() {
		System.out.println("GivenName = " + givenName + ", surName = " + surName);
	}
	
	public static List<Person> createShortList() {
		List<Person> persons = new ArrayList<Person>();
		
		Person p = new Person("John", "Smith", 31, Gender.MALE, "jsmith@tildo.com", "123", "USA");
		persons.add(p);
		p = new Person("Base", "Yes", 27, Gender.MALE, "jsmith@tildo.com", "123", "USA");
		persons.add(p);
		p = new Person("Advan", "Heloo", 27, Gender.MALE, "jsmith@tildo.com", "123", "USA");
		persons.add(p);
		p = new Person("Xavier", "Jlkdf9", 27, Gender.MALE, "jsmith@tildo.com", "123", "USA");
		persons.add(p);
		
		return persons;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
