/**
 * 
 */
package org.test;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class AddressAdapter extends TypeAdapter<Address> {
	
	protected TypeAdapter<Address> defaultAdapter;

	/**
	 * @param defaultAdapter
	 */
	public AddressAdapter(TypeAdapter<Address> defaultAdapter) {
		this.defaultAdapter = defaultAdapter;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public void write(JsonWriter out, Address value) throws IOException {
		defaultAdapter.write(out, value);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public Address read(JsonReader in) throws IOException {
		if (in.peek()==JsonToken.STRING) {
			in.skipValue();
			return null;
		}
		return defaultAdapter.read(in);
	}

}
