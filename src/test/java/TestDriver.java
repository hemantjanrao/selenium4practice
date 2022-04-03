import com.hjanrao.driver.DriverManager;
import com.hjanrao.driver.TargetFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.hjanrao.config.ConfigurationManager.configuration;

public class TestDriver extends BaseTest{

    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new TargetFactory().createInstance(configuration().browser());
        DriverManager.setDriver(driver);
    }

    @Test
    public void testDriver(){
        DriverManager.getDriver().get(configuration().url());
    }

}
