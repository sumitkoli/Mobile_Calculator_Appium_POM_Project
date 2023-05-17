package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_04_Test_Multiplication extends Base_Class{

	@Test
	public  void test_Multiplication() {
		calculator_Page.clickon_Five();
		log.info("User Clicked on Five button.....");
		calculator_Page.clickon_Multiply_Btn();
		log.info("User Clicked on Multiply button.....");
		calculator_Page.clickon_Six();
		log.info("User Clicked on Six button.....");
		calculator_Page.clickon_Equal();
		log.info("User Clicked on Equal button.....");
		
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=30;
		
		Assert.assertEquals(actual, expected);
		log.info("Multiplication test is passed.....");
	}
}
