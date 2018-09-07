package com.teamsankya.calculator;



import org.junit.Assert;
import org.junit.Test;

import com.teamsankya.calculator11.Addition;






public class AdditionTest{
	  @Test
	  public void addTest() {  
		  
		 int sum = Addition.add(20, 30);  
		 Assert.assertEquals(50, sum); 
	 }
}
