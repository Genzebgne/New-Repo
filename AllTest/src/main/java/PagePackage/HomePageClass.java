package PagePackage;

import org.openqa.selenium.By;

import BasePackage.BaseClass;

public class HomePageClass  extends BaseClass {
	public static void HomePageMethod() {
		UtilityClass.Login(com.getProperty("user"), com.getProperty("pwd"));
		driver.findElement(By.xpath("//a[@title='Home']")).click();
	}

}
