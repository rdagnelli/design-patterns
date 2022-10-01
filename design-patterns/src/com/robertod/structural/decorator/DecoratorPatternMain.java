package com.robertod.structural.decorator;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class DecoratorPatternMain implements BasePatternMain {

	@Override
	public void start() {
		Utils.print("====== Decorator Pattern ======");
		
		Pizza pizza1;
		RedPizza redPizza = new RedPizza();
		MushroomsDecorator mushroomsDecorator = new MushroomsDecorator(redPizza);
		SpicyDecorator spicyDecorator = new SpicyDecorator(mushroomsDecorator);
		pizza1 = spicyDecorator;
		
		Utils.print(pizza1.getName() + ": " +  pizza1.getPrice());
		
		Pizza pizza2;
		CheeseDecorator cheeseDecorator = new CheeseDecorator(new WhitePizza());
		pizza2 = cheeseDecorator;
		
		Utils.print(pizza2.getName() + ": " + pizza2.getPrice());
		
	}

}
