package com.robertod.creational.singleton;

import java.util.ArrayList;
import java.util.List;

import com.robertod.Utils;

public class DatabaseEagerSingleton {

	private static DatabaseEagerSingleton instance = new DatabaseEagerSingleton();
	
	private List<String> dataList = new ArrayList<>();
	
	private DatabaseEagerSingleton() {
		// Private empty constructor to avoid Database class instantiation from outside.
	}
	
	public static DatabaseEagerSingleton getInstance() {
		return instance;
	}
	
	public void persist(String data) {
		dataList.add(data);
		Utils.print(data, "persisted on the Database.", "hashcode: ", String.valueOf(instance.hashCode()));
		Utils.print("Database: ", dataList.toString());
	}
	
}
