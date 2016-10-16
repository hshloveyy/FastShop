package com.sea.test;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9#]{11}");
		System.err.println(p.matcher("150849##6#2").matches());
	}
}
