package com.robertod.creational.factory.factorymethod;

import com.robertod.Utils;

import lombok.Data;

@Data
public class DBPersistenceContext implements IPersistenceContext {

	String name;
	
	public DBPersistenceContext(String name) {
		this.name = name;
	}

	public void persist(String data) {
		Utils.print("Data \"" + data + "\" persisted on database.");
	}
	
}
