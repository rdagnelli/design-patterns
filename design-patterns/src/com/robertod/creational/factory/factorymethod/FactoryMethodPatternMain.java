package com.robertod.creational.factory.factorymethod;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class FactoryMethodPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Utils.printHeader1("Factory Method Pattern");
		try {
			IPersistenceContext persistence;

			persistence = new DBPersistenceContextFactory().createPersistenceContext();
			persistence.persist("sample_data_1");

			persistence = new FilePersistenceContextFactory().createPersistenceContext();
			persistence.persist("sample_data_2");

		} catch (Exception e) {
			// Dummy exception management
			e.printStackTrace();
		}

	}

}
