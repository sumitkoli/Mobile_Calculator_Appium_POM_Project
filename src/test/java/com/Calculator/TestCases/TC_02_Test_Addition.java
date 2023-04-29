package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_02_Test_Addition extends Base_Class{

	@Test
	public void test_Addition() {
		
		calculator_Page.clickon_One();
		calculator_Page.clickon_Add_Btn();
		calculator_Page.clickon_Four();
		calculator_Page.clickon_Equal();
		
		//Result Field Validation
		String result=calculator_Page.getText_Result_Field();
		int actual=Integer.parseInt(result);
		int expected=5;
		Assert.assertEquals(actual,expected);
	}
}
