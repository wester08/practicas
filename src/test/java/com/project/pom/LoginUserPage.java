package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUserPage extends Base {
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("pass");
	By loginBtnLocator = By.name("login");
	
	By facebookPageLocator = By.id("facebook");

	public LoginUserPage(WebDriver driver) {
		super(driver);
	// TODO Auto-generated constructor stub
			}
	
	public void loginUser() {
		if (isDisplayed(usernameLocator)) {
			type("wester.feliz08@gmail.com", usernameLocator);
			type("Morivivi970806", passwordLocator);
			click(loginBtnLocator);
		} else {
			System.out.println("üsername texbox was not present");	
		}
			
	}
		public boolean isFacebookPageDisplayed() {
			return isDisplayed(facebookPageLocator);
		
		}
		
	}	
	


