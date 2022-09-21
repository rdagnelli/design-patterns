package com.robertod.creational.factory.simplefactory;

import com.robertod.Main;

import lombok.Data;

@Data
public class DBPersistenceContext extends PersistenceContext {

	public DBPersistenceContext(String name) {
		this.name = name;
	}

	@Override
	public void persist(String data) {
		Main.print("Data persisted on database.");
	}
	
}
