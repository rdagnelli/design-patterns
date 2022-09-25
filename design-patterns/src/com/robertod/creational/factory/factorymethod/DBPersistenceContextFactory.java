package com.robertod.creational.factory.factorymethod;

public class DBPersistenceContextFactory extends PersistenceContextFactory {

	@Override
	public IPersistenceContext createPersistenceContext() {
		return new DBPersistenceContext("DB Persistence Context");
	}

}
