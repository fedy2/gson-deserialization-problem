/**
 * 
 */
package org.test;

import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class DeserializeAsString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String json = Resources.toString(Resources.getResource("asString.json"), Charsets.UTF_8);
		
		AddressAdapterFactory adapterFactory = new AddressAdapterFactory();
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapterFactory(adapterFactory).create();
		Person person = gson.fromJson(json, Person.class);
		System.out.println(person);
	}

}
