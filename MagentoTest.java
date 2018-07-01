
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MagentoTest 
{
	@Test
	public void testrun()
	{
		WebDriver driver=new ChromeDriver();
		String url="https://www.magento.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver);
		Home hp=new Home(driver);
		hp.clickOnMyacct();
		Login lp=new Login(driver);
		lp.sendEmail("subramanyaraj87@gmail.com");
		lp.sendPassword("Welcome123");
		lp.clickLogin();
		Main mp=new Main(driver);
		mp.clickOnLogout();
	}
}