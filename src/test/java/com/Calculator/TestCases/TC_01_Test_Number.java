package com.Calculator.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Calculator.BaseClass.Base_Class;

public class TC_01_Test_Number extends Base_Class {

	@Test
	public void test_Number() {
		
		calculator_Page.clickon_Zero();
		String actual = calculator_Page.getText_Formula_Field();
		String expected = "0";
		Assert.assertEquals(actual, expected);
		calculator_Page.clickon_Clear_Btn();

		calculator_Page.clickon_One();
		String actual1 = calculator_Page.getText_Formula_Field();
		String expected1 = "1";
		Assert.assertEquals(actual1, expected1);
		calculator_Page.clickon_Clear_Btn();

		calculator_Page.clickon_Two();
		String actual2 = calculator_Page.getText_Formula_Field();
		String expected2 = "2";
		Assert.assertEquals(actual2, expected2);
		calculator_Page.clickon_Clear_Btn();

		calculator_Page.clickon_Three();
		String actual3 = calculator_Page.getText_Formula_Field();
		String expected3 = "3";
		Assert.assertEquals(actual3, expected3);
		calculator_Page.clickon_Clear_Btn();
		
		calculator_Page.clickon_Four();
		String actual4 = calculator_Page.getText_Formula_Field();
		String expected4 = "4";
		Assert.assertEquals(actual4, expected4);
		calculator_Page.clickon_Clear_Btn();
		
		calculator_Page.clickon_Five();
		String actual5 = calculator_Page.getText_Formula_Field();
		String expected5 = "5";
		Assert.assertEquals(actual5, expected5);
		calculator_Page.clickon_Clear_Btn();
		
		calculator_Page.clickon_Six();
		String actual6 = calculator_Page.getText_Formula_Field();
		String expected6 = "6";
		Assert.assertEquals(actual6, expected6);
		calculator_Page.clickon_Clear_Btn();

		calculator_Page.clickon_Seven();
		String actual7 = calculator_Page.getText_Formula_Field();
		String expected7 = "7";
		Assert.assertEquals(actual7, expected7);
		calculator_Page.clickon_Clear_Btn();
		
		calculator_Page.clickon_Eight();
		String actual8 = calculator_Page.getText_Formula_Field();
		String expected8 = "8";
		Assert.assertEquals(actual8, expected8);
		calculator_Page.clickon_Clear_Btn();
		
		calculator_Page.clickon_Nine();
		String actual9 = calculator_Page.getText_Formula_Field();
		String expected9 = "9";
		Assert.assertEquals(actual9, expected9);
		calculator_Page.clickon_Clear_Btn();
	}
}
