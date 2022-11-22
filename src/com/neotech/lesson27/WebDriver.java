package com.neotech.lesson27;

interface WebDriver {
	void open(); // by default public & abstract

	void close();

	String getTitle();
}

interface TakesScreenShot {
	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened");
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");
	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Chrome");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Chrome");
	}
}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox driver opened");
	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");
	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Firefox");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Firefox");
	}
}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened");
	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");
	}

	@Override
	public String getTitle() {
		return "Neotech Academy - Safari";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Safari");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Safari");
	}
}

