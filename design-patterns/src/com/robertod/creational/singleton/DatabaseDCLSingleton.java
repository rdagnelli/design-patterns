package com.robertod.creational.singleton;

import java.util.ArrayList;
import java.util.List;

import com.robertod.Utils;

/**
 * Double-checked Locking Singleton
 * Doesn't work on Java 1.4 or earlier
 * 
 * @author Roberto D'Agnelli
 */
public class DatabaseDCLSingleton {

	private volatile static DatabaseDCLSingleton instance;
	
	private List<String> dataList = new ArrayList<>();
	
	private DatabaseDCLSingleton() {
		// Private empty constructor to avoid Database class instantiation from outside.
	}
	
	public static synchronized DatabaseDCLSingleton getInstance() {
		if(instance == null) {
			synchronized (DatabaseDCLSingleton.class) {
				if(instance == null) {
					instance = new  DatabaseDCLSingleton();
				}
			}
		}
		return instance;
	}
	
	public void persist(String data) {
		dataList.add(data);
		Utils.print(data, "persisted on the Database.", "hashcode: ", String.valueOf(instance.hashCode()));
		Utils.print("Database: ", dataList.toString());
	}
	
}
