package PagePackage;

import org.openqa.selenium.By;

import BasePackage.BaseClass;

public class SharedFileClass extends BaseClass {
	public static void SharedMethod() {
	
		driver.findElement(By.linkText("Shared Files")).click();
		System.out.println("=== shared folder test response==" +driver.getTitle());
	}

}
