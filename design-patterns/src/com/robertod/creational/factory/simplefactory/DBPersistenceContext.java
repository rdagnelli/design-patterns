package com.robertod.creational.factory.simplefactory;

import com.robertod.Utils;

import lombok.Data;

@Data
public class DBPersistenceContext extends PersistenceContext {

	public DBPersistenceContext(String name) {
		this.name = name;
	}

	@Override
	public void persist(String data) {
		Utils.print("Data \"" + data + "\" persisted on database.");
	}
	
}
