package com.hjanrao.test;

import com.hjanrao.base.BaseTest;
import com.hjanrao.driver.DriverManager;
import com.hjanrao.pages.home.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.hjanrao.config.ConfigurationManager.configuration;
import static org.assertj.core.api.Assertions.assertThat;

public class TestDriver extends BaseTest {

    HomePage homePage;

    @Test
    public void testDriver(){
        WebDriver driver = DriverManager.getDriver();
        driver.get(configuration().url());

        assertThat(driver.getCurrentUrl()).isEqualTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testHomePage(){
        homePage = new HomePage();
        WebDriver driver = DriverManager.getDriver();
        driver.get(configuration().url());
        homePage.gotoLoginPage();

        assertThat(driver.getCurrentUrl()).isEqualTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
}
