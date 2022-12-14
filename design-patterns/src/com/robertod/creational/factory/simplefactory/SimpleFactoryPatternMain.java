package com.robertod.creational.factory.simplefactory;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class SimpleFactoryPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Utils.printHeader1("Simple Factory Pattern");
		try {
			PersistenceContext persistence;

			persistence = PersistenceContextFactory
					.createPersistenceContext(PersistenceContextFactory.FILE_PERSISTENCE);
			persistence.persist("sample_data_1");

			persistence = PersistenceContextFactory.createPersistenceContext(PersistenceContextFactory.DB_PERSISTENCE);
			persistence.persist("sample_data_2");

		} catch (Exception e) {
			// Dummy exception management
			e.printStackTrace();
		}

	}

}
