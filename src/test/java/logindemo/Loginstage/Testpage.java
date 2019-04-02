package logindemo.Loginstage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testpage {
	
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		System.out.println(dr.getTitle());
		String Actual="Google";
		String tit=dr.getTitle();
		Assert.assertEquals(tit, Actual);
		
		
	}

}
