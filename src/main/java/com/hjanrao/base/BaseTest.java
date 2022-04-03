package com.hjanrao.base;

import com.hjanrao.driver.DriverManager;
import com.hjanrao.driver.TargetFactory;
import com.hjanrao.listners.TestListener;
import com.hjanrao.report.AllureManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static com.hjanrao.config.ConfigurationManager.configuration;

@Listeners({TestListener.class})
public abstract class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        AllureManager.setAllureEnvironmentInformation();
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void preCondition(@Optional("chrome") String browser) {
        WebDriver driver = new TargetFactory().createInstance(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configuration().timeout()));
        DriverManager.setDriver(driver);

        DriverManager.getDriver().get(configuration().url());
    }

    @AfterMethod(alwaysRun = true)
    public void postCondition() {
        DriverManager.quit();
    }
}
