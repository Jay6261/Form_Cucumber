package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openBrowserTest {

	@Test
	public void openbrowser()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String actual = driver.getTitle();
		String expected = "Practice Page";
		Assert.assertEquals(expected, actual);
		driver.findElement(By.name("radioButton")).click();
	}
}
