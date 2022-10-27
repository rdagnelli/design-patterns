package com.robertod.behavioural.command;

public class DeleteCommand extends Command {

    private UsersManager receiver;
    private String username;
    
    public DeleteCommand(UsersManager receiver, String username) {
    	this.receiver = receiver;
    	this.username = username;
    }
    
	@Override
	public void execute() {
		receiver.delete(username);
	}

}
