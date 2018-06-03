package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static Properties com = null;
	public static WebDriver driver;
	public static FileInputStream src = null;
	
	public BaseClass() {
		com = new Properties();
		
try {
			
			System.out.println("base class hello world");
								
			String filePath= "."+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"prop"+File.separator+"config.properties";
			
			System.out.println("File taken from : =============================== " + filePath);
			
			src = new FileInputStream(System.getProperty("user", filePath));
			com.load(src);     
			
			System.out.println("File is loaded ================================");
		}catch(FileNotFoundException e) {
			System.out.println("File not Found here ");
		}	catch (Exception e) {
			System.out.println("File not exist");
		}
	}
	
	@BeforeClass
	public void openapp( ) throws Exception 
	     {
		
		    System.setProperty("webdriver.gecko.driver","src\\main\\resources\\DriverRepo\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(com.getProperty("url"));
			System.out.println("here is the url ============" + com.getProperty("url"));
			driver.manage().window().maximize();
		


	}
}


