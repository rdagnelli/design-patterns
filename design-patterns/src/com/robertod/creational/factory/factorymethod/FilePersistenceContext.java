package com.robertod.creational.factory.factorymethod;

import com.robertod.Main;

import lombok.Data;

@Data
public class FilePersistenceContext implements IPersistenceContext {

	String name;
	
	public FilePersistenceContext(String name) {
		this.name = name;
	}

	public void persist(String data) {
		Main.print("Data \"" + data + "\" persisted on file.");
	}
	
}
