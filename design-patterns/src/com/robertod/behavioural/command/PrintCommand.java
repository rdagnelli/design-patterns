package com.robertod.behavioural.command;

public class PrintCommand extends Command {

    private UsersManager receiver;
    
    public PrintCommand(UsersManager receiver) {
    	this.receiver = receiver;
    }
    
	@Override
	public void execute() {
		receiver.printAllUsers();
	}

}
