package westerpractica.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;

	By facebookPageLocator = By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg\"]");
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("pass");
	
	By loginBtnLocator = By.name("login");
	
	By homepageLocator = By.id("facebook");
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}
	
	@Test
	public void loginUser() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.findElement(facebookPageLocator).isDisplayed()) {
			driver.findElement(usernameLocator).sendKeys("andyfeliz08@gmail.com");
			driver.findElement(passwordLocator).sendKeys("Morivivi970806");
			driver.findElement(loginBtnLocator).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(homepageLocator).isDisplayed());
			
		}
			else {
				System.out.print("username textbox was not present");
				
			}
			
	     }
		
	
      }
		
		
