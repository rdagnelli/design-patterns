package com.robertod.creational.factory.simplefactory;

import lombok.Data;

@Data
public abstract class PersistenceContext {
	
	protected String name;
	
	public abstract void persist(String data);
	
}
