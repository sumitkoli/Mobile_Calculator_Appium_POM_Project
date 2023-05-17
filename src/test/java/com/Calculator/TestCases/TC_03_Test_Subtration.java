package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_03_Test_Subtration extends Base_Class{

	@Test
	public void test_Subtraction() {
		calculator_Page.clickon_Nine();
		log.info("User Clicked on Nine button.....");
		calculator_Page.clickon_Sub_Btn();
		log.info("User Clicked on Subtract button.....");
		calculator_Page.clickon_Four();
		log.info("User Clicked on Four button.....");
		calculator_Page.clickon_Equal();
		log.info("User Clicked on Equal button.....");
		
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=5;
		
		Assert.assertEquals(actual, expected);
		log.info("Subtraction test is passed.....");
	}
}
