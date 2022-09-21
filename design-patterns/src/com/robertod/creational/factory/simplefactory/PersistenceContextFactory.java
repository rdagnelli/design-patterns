package com.robertod.creational.factory.simplefactory;

public class PersistenceContextFactory {

	public static final String FILE_PERSISTENCE = "FILE";
	public static final String DB_PERSISTENCE = "DB";

	public static PersistenceContext createPersistenceContext(String type) throws Exception {
		switch (type) {
		case FILE_PERSISTENCE:
			return new FilePersistenceContext("File persisence context");
		case DB_PERSISTENCE:
			return new DBPersistenceContext("Database persistence context");
		default:
			throw new Exception("Invalid persistence context type.");
		}
	}
}
