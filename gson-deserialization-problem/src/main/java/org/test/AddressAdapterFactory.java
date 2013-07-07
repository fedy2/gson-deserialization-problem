/**
 * 
 */
package org.test;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * @author "Federico De Faveri defaveri@gmail.com"
 *
 */
public class AddressAdapterFactory implements TypeAdapterFactory {

	
	@Override
	@SuppressWarnings("unchecked")
	public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
		if (type.getRawType()!=Address.class) return null;

		TypeAdapter<Address> defaultAdapter = (TypeAdapter<Address>) gson.getDelegateAdapter(this, type);
		return (TypeAdapter<T>) new AddressAdapter(defaultAdapter);
	}

}
