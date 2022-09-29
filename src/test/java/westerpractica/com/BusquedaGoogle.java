package westerpractica.com;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BusquedaGoogle {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		

        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	}
		
		@Test
		public void testGooglePage() {
			
			WebElement searchbox = driver.findElement(By.name("q"));
			
			searchbox.clear();
			
			searchbox.sendKeys("quality-stream introduccion a la automatizacion de pruebas de software");
			
			searchbox.submit();
			
			//Implicitly wait
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Explicit Wait
			
			//WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10000));
			
			//ewait.until(ExpectedConditions.titleContains("quality-stream"));
			
			//Fluent Wait
			
			
			
			
			assertEquals("quality-stream introduccion a la automatizacion de pruebas de software - Buscar con Google", driver.getTitle());
		
		
		}
		
			@After
			public void tearDown() {
				driver.quit();
				
				
			}
				
		
	}
