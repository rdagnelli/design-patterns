package com.robertod.creational.factory.factorymethod;

import com.robertod.Main;

import lombok.Data;

@Data
public class DBPersistenceContext implements IPersistenceContext {

	String name;
	
	public DBPersistenceContext(String name) {
		this.name = name;
	}

	public void persist(String data) {
		Main.print("Data \"" + data + "\" persisted on database.");
	}
	
}
