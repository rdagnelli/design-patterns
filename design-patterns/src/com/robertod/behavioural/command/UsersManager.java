package com.robertod.behavioural.command;

import java.util.HashMap;
import java.util.Map;

import com.robertod.Utils;

public class UsersManager {

	private Map<String, User> usersMap = new HashMap<>();
	
	public void create(User user) {
		usersMap.put(user.getUsername(), user);
		Utils.print(user.toString(), "created");
	}
	
	public void delete(String username) {
		usersMap.remove(username);
		Utils.print(username, "removed");
	}
	
	public void printAllUsers() {
	    Utils.print("Users:", usersMap.toString());
	}
}
