/**
 * 
 */
package org.test;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class Person {
	
	protected String name;
	protected String surname;
	protected int age;
	protected Address address;
	/**
	 * @param name
	 * @param surname
	 * @param age
	 * @param address
	 */
	public Person(String name, String surname, int age, Address address) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}

}
