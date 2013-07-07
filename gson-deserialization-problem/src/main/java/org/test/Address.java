/**
 * 
 */
package org.test;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class Address {
	
	protected String street;
	protected int number;
	protected String city;
	
	/**
	 * @param street
	 * @param number
	 * @param city
	 */
	public Address(String street, int number, String city) {
		this.street = street;
		this.number = number;
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=");
		builder.append(street);
		builder.append(", number=");
		builder.append(number);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
}
