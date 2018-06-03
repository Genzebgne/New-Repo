package TestPackage;

import org.testng.annotations.Test;

import PagePackage.HomePageClass;
import PagePackage.RepositoryClass;
import PagePackage.SharedFileClass;
                  

public class TestClass extends HomePageClass {
	@Test(priority=1)
	    public void HomePageTestMethod() throws Exception {
		HomePageClass.HomePageMethod();
		
		Thread.sleep(5000);
		SharedFileClass.SharedMethod();
		Thread.sleep(3000);
		RepositoryClass.RepositoryMethod();
		Thread.sleep(1000);
	}
	

}
