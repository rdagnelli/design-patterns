package com.robertod.creational.factory.factorymethod;

public class FilePersistenceContextFactory extends PersistenceContextFactory {

	@Override
	public IPersistenceContext createPersistenceContext() {
		return new FilePersistenceContext("File Persistence Context");
	}

}
