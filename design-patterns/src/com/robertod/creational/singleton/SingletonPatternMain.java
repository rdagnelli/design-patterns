package com.robertod.creational.singleton;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class SingletonPatternMain implements BasePatternMain {

	@Override
	public void start() {
		
		Utils.printHeader1("Singleton Pattern");

		lazySingleton();
		
		eagerSingleton();
		
		doubleCheckedLockingSingleton();
		
		enumSingleton();
		
	}

	private void lazySingleton() {
		Utils.printHeader2("Eager Singleton");
		DatabaseLazySingleton database = DatabaseLazySingleton.getInstance();
		database.persist("Data_1");

		database = DatabaseLazySingleton.getInstance();
		database.persist("Data_2");
		database.persist("Data_3");
		
		database = DatabaseLazySingleton.getInstance();
		database.persist("Data_4");
	}

	private void eagerSingleton() {
		Utils.printHeader2("Lazy Singleton");
		DatabaseEagerSingleton database = DatabaseEagerSingleton.getInstance();
		database.persist("Data_1");

		database = DatabaseEagerSingleton.getInstance();
		database.persist("Data_2");
		database.persist("Data_3");
		
		database = DatabaseEagerSingleton.getInstance();
		database.persist("Data_4");
	}
	
	private void doubleCheckedLockingSingleton() {
		Utils.printHeader2("Double-Checked Locking Singleton");
		DatabaseDCLSingleton database = DatabaseDCLSingleton.getInstance();
		database.persist("Data_1");

		database = DatabaseDCLSingleton.getInstance();
		database.persist("Data_2");
		database.persist("Data_3");
		
		database = DatabaseDCLSingleton.getInstance();
		database.persist("Data_4");
	}
	
	private void enumSingleton() {
		Utils.printHeader2("ENUM Singleton");
		DatabaseEnumSingleton database = DatabaseEnumSingleton.INSTANCE;
		database.persist("Data_1");

		database = DatabaseEnumSingleton.INSTANCE;
		database.persist("Data_2");
		database.persist("Data_3");
		
		database = DatabaseEnumSingleton.INSTANCE;
		database.persist("Data_4");
	}

}
