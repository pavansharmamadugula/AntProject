package com.cgi.mypackage;

import java.util.Random;

public class GenerateToken {

	public static void main(String[] args) {
		System.out.println("Generated Token: " + getToken());
	}

	private static double getToken() {
		return new Random().nextGaussian();
	}

}
