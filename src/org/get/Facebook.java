package org.get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	WebDriver dev=new ChromeDriver();
	System.setProperty("webdriver.chome.driver", "C:\\GopiDeva\\Rrprj\\driver\\chromedriver.exe");
	dev.get("https://www.facebook.com");
	dev.manage().window().maximize();
	dev.quit();
}
}
