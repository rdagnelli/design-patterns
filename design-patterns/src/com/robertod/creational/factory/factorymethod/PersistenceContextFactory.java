package com.robertod.creational.factory.factorymethod;

public abstract class PersistenceContextFactory {

	public void persist(String data) {
		IPersistenceContext persistenceContext = createPersistenceContext();
		persistenceContext.persist(data);
	}
	
	/**
	 * Factory Method that creates and return a class implementing  IPersistenceContext
	 * @return IPersistenceContext instance
	 */
	public abstract IPersistenceContext createPersistenceContext();
	
}
