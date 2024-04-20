package com.sgtest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static WebDriver oBrowser=null;
	private static void lunchBrowser()
	{
		try {
			oBrowser= new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigateUrl()
	{
		try {
			
			oBrowser.get("https://www.flipkart.com");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try {
			
			oBrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		lunchBrowser();
		navigateUrl();
		closeApplication();

	}
}
