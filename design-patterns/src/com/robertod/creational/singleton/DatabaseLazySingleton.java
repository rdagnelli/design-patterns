package com.robertod.creational.singleton;

import java.util.ArrayList;
import java.util.List;

import com.robertod.Utils;

public class DatabaseLazySingleton {

	private static DatabaseLazySingleton instance;
	
	private List<String> dataList = new ArrayList<>();
	
	private DatabaseLazySingleton() {
		// Private empty constructor to avoid Database class instantiation from outside.
	}
	
	public static synchronized DatabaseLazySingleton getInstance() {
		if(instance == null) {
			instance = new DatabaseLazySingleton();
		}
		return instance;
	}
	
	public void persist(String data) {
		dataList.add(data);
		Utils.print(data, "persisted on the Database.", "hashcode: ", String.valueOf(instance.hashCode()));
		Utils.print("Database: ", dataList.toString());
	}
	
}
