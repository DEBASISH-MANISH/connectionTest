package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestGitHubJenkinsConnection{
	
	
	@Test
	public void validateConnection(){
		System.setProperty("webdriver.chrome.driver", "C:\\Philips_Project\\Project-Framework\\GitHubJenkinsIntegration\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://caoapps.htce.nl.philips.com/shpar-stage");	
		driver.get("https://www.google.com");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		String expTitle="Google";
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Test is pass");
	}

}
