package com.robertod.creational.singleton;

import java.util.ArrayList;
import java.util.List;

import com.robertod.Utils;

/**
 * Enum fields are compile time constants, but they are instances of their enum type. 
 * They're constructed when the enum type is referenced for the first time.
 * 
 * INSTANCE is same as public static final MySingleton INSTANCE = new MySingleton();
 * 
 * @author Roberto D'Agnelli
 */
public enum DatabaseEnumSingleton {

	INSTANCE;
	
	private List<String> dataList = new ArrayList<>();
	
	public void persist(String data) {
		dataList.add(data);
		Utils.print(data, "persisted on the Database.", "hashcode: ", String.valueOf(this.hashCode()));
		Utils.print("Database: ", dataList.toString());
	}
	
}
