package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUser extends Base{
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("pass");
	By loginBtnLocator = By.name("login");
	
	By facebookPageLocator = By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg\"]");

	public LoginUser(WebDriver driver) {
		super(driver);
	// TODO Auto-generated constructor stub
			}
	
	public void loginUser() {
		
		
	}
		
		public boolean isFacebookPageDisplayed() {
			
			return true;
		}
}	
	


