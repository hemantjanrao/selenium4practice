package com.hjanrao.test;

import com.hjanrao.base.BaseTest;
import com.hjanrao.driver.DriverManager;
import com.hjanrao.pages.home.HomePage;
import com.hjanrao.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.hjanrao.config.ConfigurationManager.configuration;
import static org.assertj.core.api.Assertions.assertThat;

public class TestDriver extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void testDriver(){
        WebDriver driver = DriverManager.getDriver();
        driver.get(configuration().url());

        assertThat(driver.getCurrentUrl()).isEqualTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testHomePage(){
        homePage.gotoLoginPage();

        assertThat(DriverManager.getDriver().getCurrentUrl()).isEqualTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        loginPage.Login("hf_challenge_123456@hf123456.com", "123456");
    }
}
