package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_02_Test_Addition extends Base_Class{

	@Test
	public void test_Addition() {
		
		calculator_Page.clickon_One();
		log.info("User Clicked on One button.....");
		calculator_Page.clickon_Add_Btn();
		log.info("User Clicked on Add button.....");
		calculator_Page.clickon_Four();
		log.info("User Clicked on Four button.....");
		calculator_Page.clickon_Equal();
		log.info("User Clicked on Equal button.....");
		//Result Field Validation
		
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=5;
		Assert.assertEquals(actual,expected);
		log.info("Addition test is passed.....");
	}
}
