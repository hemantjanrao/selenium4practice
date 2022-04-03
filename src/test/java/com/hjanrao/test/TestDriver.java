package com.hjanrao.test;

import com.hjanrao.base.BaseTest;
import com.hjanrao.driver.DriverManager;
import com.hjanrao.driver.TargetFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.hjanrao.config.ConfigurationManager.configuration;
import static org.assertj.core.api.Assertions.assertThat;

public class TestDriver extends BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new TargetFactory().createInstance(configuration().browser());
        DriverManager.setDriver(driver);
    }

    @Test
    public void testDriver(){
        WebDriver driver = DriverManager.getDriver();
        driver.get(configuration().url());

        assertThat(driver.getCurrentUrl()).isEqualTo("http://automationpractice.com/index.php");

    }
}
