package com.robertod.behavioural.command;

public class CreateCommand extends Command {

    private UsersManager receiver;
    private User param;
    
    public CreateCommand(UsersManager receiver, User param) {
    	this.receiver = receiver;
    	this.param = param;
    }
    
	@Override
	public void execute() {
		receiver.create(param);
	}

}
