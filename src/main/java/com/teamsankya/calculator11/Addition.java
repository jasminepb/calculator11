package com.teamsankya.calculator11;

import org.apache.log4j.Logger;

public class Addition {
	private static final Logger LOGGER=Logger.getLogger(Addition.class);
		public static int add(int a, int b)
	{
		LOGGER.info("addition of two integer number"+a + "+" +b);
		return a+b;
		
	}
	public static double add(double a, double b) {
		return a+b;
		
	}
	public static float add(float a, float b) {
		return a+b;
		
	}
	public static long add(long a, long b) {
		return a+b;
		
	}
	
	
	
	
	
}
