package com.neotech.lesson27;

public class Homework2 {
	
	public static void main(String[] args) {
			// You can not create an object from an interface
			// RemoteWebDriver rwd = new RemoteWebDriver();

			ChromeDriver c = new ChromeDriver();
			c.open();

			FirefoxDriver f = new FirefoxDriver();
			f.open();

			SafariDriver s = new SafariDriver();
			s.open();

			System.out.println("---Upcasting---");
			RemoteWebDriver rwd1 = c; // up-casting
			rwd1.open();

			RemoteWebDriver rwd2 = f; // up-casting
			rwd2.open();

			System.out.println("Why do we need upcasting?");
			ChromeDriver[] chromeArray = new ChromeDriver[3];
			FirefoxDriver[] firefoxArray = new FirefoxDriver[3];

			RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
			remoteArray[0] = c;
			remoteArray[1] = f;
			remoteArray[2] = s;

			for (RemoteWebDriver driver : remoteArray) {
				System.out.println("-------------");
				driver.open();
				driver.getScreenShot();
				System.out.println(driver.getTitle());
				driver.navigate();
				driver.close();
			}
		}

	

}
