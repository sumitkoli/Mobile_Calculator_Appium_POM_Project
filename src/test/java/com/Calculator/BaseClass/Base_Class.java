package com.Calculator.BaseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base_Class {
	public static AndroidDriver<MobileElement> driver;
	
	
	@BeforeMethod
	public void applicationsetup_Method() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("ignoreHiddenApiPolicyError" , true) ;
		
		cap.setCapability("deviceName","Oneplus7T");
		
		cap.setCapability("udid","b3fdf56d");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		
		cap.setCapability("appPackage","com.oneplus.calculator");
		
		cap.setCapability("appActivity","com.oneplus.calculator.Calculator");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AndroidDriver<>(url,cap);
		
	}
	
	@AfterMethod
	public void applicationtearDown_Method() {
		driver.quit();
	}

}
