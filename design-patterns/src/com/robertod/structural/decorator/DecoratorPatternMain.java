package com.robertod.structural.decorator;

import com.robertod.BasePatternMain;
import com.robertod.Main;

public class DecoratorPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Main.print("====== Decorator Pattern ======");
		
		Pizza pizza1;
		RedPizza redPizza = new RedPizza();
		MushroomsDecorator mushroomsDecorator = new MushroomsDecorator(redPizza);
		SpicyDecorator spicyDecorator = new SpicyDecorator(mushroomsDecorator);
		pizza1 = spicyDecorator;
		
		Main.print(pizza1.getName() + ": " +  pizza1.getPrice());
		
		Pizza pizza2;
		CheeseDecorator cheeseDecorator = new CheeseDecorator(new WhitePizza());
		pizza2 = cheeseDecorator;
		
		Main.print(pizza2.getName() + ": " + pizza2.getPrice());
		
	}

}
