package com.neotech.lesson24;

public class WebDriverTest {

	// Runtime Polymorphism
		// Method overriding
		// The driver will open the browser depending
		// on the object that has been created
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.openBrowser();
			// Go to facebook
			// Enter username
			// Enter password
			// Click the login button
		}
}
