package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_05_Test_Division extends Base_Class{

	@Test
	public void test_Division() {
		calculator_Page.clickon_Five();
		log.info("User Clicked on Five button.....");
		calculator_Page.clickon_Five();
		log.info("User Clicked on Five button.....");
		calculator_Page.clickon_Divide_Btn();
		log.info("User Clicked on Division button.....");
		calculator_Page.clickon_Five();
		log.info("User Clicked on Five button.....");
		calculator_Page.clickon_Equal();
		log.info("User Clicked on Equal button.....");
		
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=11;
		
		Assert.assertEquals(actual, expected);
		log.info("Division test is passed.....");
	}
}
