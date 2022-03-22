package greenExcercise;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class GreenExcerciseAfterEX10 extends BaseClass{
	@Test
	public void tc1() {
		startTime();
		launchUrl("https://www.facebook.com/");
	}
	@Test
	@Parameters({"email","password"})
	public void tc2(String email, String password) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@Test
	public void tc4() {
		System.out.println("All the best");
	}
	@Test
	public void tc5() {
		
		endTime();
	}
}
