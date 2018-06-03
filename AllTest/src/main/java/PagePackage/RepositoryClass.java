package PagePackage;

import org.openqa.selenium.By;

import BasePackage.BaseClass;

public class RepositoryClass extends BaseClass {
	public static void RepositoryMethod () {
		//UtilityClass.Login(com.getProperty("user"), com.getProperty("pwd"));
		driver.findElement(By.linkText("Repository")).click();
		System.out.println("=====" + driver.getTitle());
	}

}
                           