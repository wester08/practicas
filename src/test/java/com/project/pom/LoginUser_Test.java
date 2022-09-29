package com.project.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginUser_Test {

    private WebDriver driver;
    LoginUserPage loginUser;

    
    @Before
    public void setUp() throws Exception {
        loginUser = new LoginUserPage(driver);
        driver = loginUser.edgeDriverConnection();
        loginUser.visit("https://www.facebook.com");

        
    }


@After
public void tearDowm() throws Exception {
    //driver.quit();
}

@Test
public void test() {
    



}
    
}
