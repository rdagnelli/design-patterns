package com.robertod.creational.factory.simplefactory;

import com.robertod.Utils;

import lombok.Data;

@Data
public class FilePersistenceContext extends PersistenceContext {

	public FilePersistenceContext(String name) {
		this.name = name;
	}

	@Override
	public void persist(String data) {
		Utils.print("Data \"" + data + "\" persisted on file.");
	}
	
}
