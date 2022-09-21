package com.robertod.creational.factory.simplefactory;

import com.robertod.Main;

import lombok.Data;

@Data
public class FilePersistenceContext extends PersistenceContext {

	public FilePersistenceContext(String name) {
		this.name = name;
	}

	@Override
	public void persist(String data) {
		Main.print("Data persisted on file."); 
	}
	
}
