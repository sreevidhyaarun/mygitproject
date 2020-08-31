package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass {
@Test
	public void TC001() {
		// TODO Auto-generated method stub
	System.out.println("ajkcbh");
	String exepath= "C:\\Users\\sreev\\Desktop\\Sree\\Learning\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",exepath);
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize(); 
	}

}
