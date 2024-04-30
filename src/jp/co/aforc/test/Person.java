package jp.co.aforc.test;

public class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	public boolean isAdult(Person person) {
		return person.getAge() >= 20;
	}
}
