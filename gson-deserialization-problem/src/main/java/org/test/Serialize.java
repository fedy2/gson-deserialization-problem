/**
 * 
 */
package org.test;

import com.google.gson.Gson;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class Serialize {

	public static void main(String[] args) {
		Address address = new Address("Amphitheatre Parkway", 1600, "Mountain View");
		Person person = new Person("John", "Smith", 32, address);
		Gson gson = new Gson();
		String json = gson.toJson(person);
		System.out.println(json);
	}

}
