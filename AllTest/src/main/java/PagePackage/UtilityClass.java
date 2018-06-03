package PagePackage;

import org.openqa.selenium.By;

import BasePackage.BaseClass;

public class UtilityClass extends BaseClass {
	public static void Login(String user, String pass)
	{
		System.out.println(" ===== before Login ==== " + driver.getTitle());
		driver.findElement(By.xpath(com.getProperty("user_xpath"))).sendKeys(user);
		driver.findElement(By.xpath(com.getProperty("pwd_xpath"))).sendKeys(pass);
		driver.findElement(By.xpath(com.getProperty("button_xpath"))).click();
		System.out.println("======== after login ====" + driver.getTitle());
	}

}
