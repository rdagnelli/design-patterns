package com.robertod;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Utils {

	public static final String SPACE_SEPARATOR = " ";
	
	public static final String EMPTY = "";
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(String...strings) {
		List<String> stringList = Arrays.asList(strings);
		StringJoiner stringJoiner = new StringJoiner(SPACE_SEPARATOR);
		stringList.forEach(s -> stringJoiner.add(s));
		print(stringJoiner.toString());
	}
	
	public static void printHeader1(String s) {
		print(EMPTY);
		print("=====", s, "=====");
	}
	
	public static void printHeader2(String s) {
		print(EMPTY);
		print("===", s, "===");
	}
}
