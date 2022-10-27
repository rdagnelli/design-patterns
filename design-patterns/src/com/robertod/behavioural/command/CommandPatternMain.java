package com.robertod.behavioural.command;

import com.robertod.BasePatternMain;
import com.robertod.Utils;

public class CommandPatternMain implements BasePatternMain {

	@Override
	public void start() {

        Utils.printHeader1("Command Pattern");
        
		UsersManager usersManager = new UsersManager();
		Command command = new CreateCommand(usersManager, new User("user1"));
		command.execute();
		
		Command printCommand = new PrintCommand(usersManager);
		printCommand.execute();
		
		command = new CreateCommand(usersManager, new User("user2"));
        command.execute();
        printCommand.execute();

        
        command = new DeleteCommand(usersManager, "user1");
        command.execute();
        printCommand.execute();
	}
	

}
