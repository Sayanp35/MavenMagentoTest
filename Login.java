

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendEmail(String username)
	{
		driver.findElement(email).sendKeys(username);
	}
	public void sendPassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
}