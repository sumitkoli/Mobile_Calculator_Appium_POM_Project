package com.Calculator.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.Delegate;

public class CalculatorPage_PageObjects {

	AndroidDriver<MobileElement> ldriver;
	public CalculatorPage_PageObjects(AndroidDriver<MobileElement> rdriver) {
		ldriver=rdriver;

		PageFactory.initElements(rdriver,this);
	}
	
	//WebElement For Zero Button 
	@FindBy(id="com.oneplus.calculator:id/digit_0")
	WebElement Zero;
	
	//WebElement For One Button
	@FindBy(id="com.oneplus.calculator:id/digit_1")
	WebElement One;
	
	//WebElement For Two Button
	@FindBy(id="com.oneplus.calculator:id/digit_2")
	WebElement Two;
	
	//WebElement For Three Button
	@FindBy(id="com.oneplus.calculator:id/digit_3")
	WebElement Three;
	
	//WebElement For Four Button
	@FindBy(id="com.oneplus.calculator:id/digit_4")
	WebElement Four;
	
	//WebElement For Five Button
	@FindBy(id="com.oneplus.calculator:id/digit_5")
	WebElement Five;
	
	//WebElement For Six Button
	@FindBy(id="com.oneplus.calculator:id/digit_6")
	WebElement Six;
	
	//WebElement For Seven Button
	@FindBy(id="com.oneplus.calculator:id/digit_7")
	WebElement Seven;
	
	//WebElement For Eight Button
	@FindBy(id="com.oneplus.calculator:id/digit_8")
	WebElement Eight;
	
	//WebElement For Nine Button
	@FindBy(id="com.oneplus.calculator:id/digit_9")
	WebElement Nine;
	
	//WebElement For ADD Button
	@FindBy(id="com.oneplus.calculator:id/op_add")
	WebElement ADD;
	
	//WebElement For SUB Button
	@FindBy(id="com.oneplus.calculator:id/op_sub")
	WebElement SUB;

	//WebElement For MULTIPLY Button
	@FindBy(id="com.oneplus.calculator:id/op_mul")
	WebElement MULTIPLY;

	//WebElement For DIVDE Button
	@FindBy(id="com.oneplus.calculator:id/op_div")
	WebElement DIVIDE;

	//WebElement For PERCENT Button
	@FindBy(id="com.oneplus.calculator:id/op_pct")
	WebElement PERCENT;

	//WebElement For DELETE Button
	@FindBy(id="com.oneplus.calculator:id/del")
	WebElement DELETE;
	
	//WebElement For CLEAR Button
	@FindBy(id="com.oneplus.calculator:id/clr")
	WebElement CLEAR;
	
	//WebElement For POINT Button
	@FindBy(id="com.oneplus.calculator:id/dec_point")
	WebElement POINT;
	
	//WebElement For SCIENTIFICBTN Button
	@FindBy(id="com.oneplus.calculator:id/ibToogleScientific")
	WebElement SCIENTIFICBTN;
	
	//WebElement For history_btn Button
	@FindBy(id="com.oneplus.calculator:id/imgdragviewnew")
	WebElement history_btn;
	
	//WebElement For EQUAL Button
	@FindBy(id="com.oneplus.calculator:id/eq")
	WebElement EQUAL;
	
	//WebElement For Result Button
	@FindBy(id="com.oneplus.calculator:id/result")
	WebElement Result;
	
	//Method for Click on Zero Button
	public void clickon_Zero() {
		Zero.click();
	}
	
	//Method for Click on One Button
	public void clickon_One() {
		One.click();
	}
	
	//Method for Click on Two Button
	public void clickon_Two() {
		Two.click();
	}
	
	//Method for Click on Three Button
	public void clickon_Three() {
		Three.click();
	}
	
	//Method for Click on Four Button
	public void clickon_Four() {
		Four.click();
	}
	
	//Method for Click on Five Button
	public void clickon_Five() {
		Five.click();
	}
	
	//Method for Click on Six Button
	public void clickon_Six() {
		Six.click();
	}
	
	//Method for Click on Seven Button
	public void clickon_Seven() {
		Seven.click();
	}
	
	//Method for Click on Eight Button
	public void clickon_Eight() {
		Eight.click();
	}
	
	//Method for Click on Nine Button
	public void clickon_Nine() {
		Nine.click();
	}
	
	//Method for Click on ADD Button
	public void clickon_Add_Btn() {
		ADD.click();
	}
	
	//Method for Click on SUB Button
	public void clickon_Sub_Btn() {
		SUB.click();
	}
	
	//Method for Click on MULTIPLY Button
	public void clickon_Multiply_Btn() {
		MULTIPLY.click();
	}
	
	//Method for Click on  DIVIDE Button
	public void clickon_Divide_Btn() {
		DIVIDE.click();
	}
	
	//Method for Click on DELETE Button
	public void clickon_Delete_Btn() {
		DELETE.click();
	}
	
	//Method for Click on CLEAR Button
	public void clickon_Clear_Btn() {
		CLEAR.click();
	}
	
	//Method for Click on POINT Button
	public void clickon_Point_Btn() {
		POINT.click();
	}
	
	//Method for Click on SCIENTIFIC TOGGOLE BTN Button
	public void clickon_Scientific_Toggole_Btn() {
		SCIENTIFICBTN.click();
	}
	
	//Method for Click on HISTORY Button
	public void clickon_History_Menu() {
		history_btn.click();
	}
	
	//Method for Click on EQUAL Button
	public void clickon_Equal() {
		EQUAL.click();
	}
	
	//Method to get text from Result field
	public void get_Result(String Result_Text) {
		Result_Text=Result.getText();
	}
}
