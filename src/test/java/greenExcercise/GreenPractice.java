package greenExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenPractice{
	String [][] Data ={
		{"Admi","admin12"},
		{"Admi","admin123"},
		{"Admin","admin12"},
		{"Admin","admin123"}
	};
	@DataProvider(name="LoginData")
	public String[][] loginData() {
		return Data;
	}
	@Test(dataProvider="LoginData")
	public void tc2(String userId, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userId);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
}
