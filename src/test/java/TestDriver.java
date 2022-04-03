import com.hjanrao.driver.TargetFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.hjanrao.config.ConfigurationManager.configuration;

public class TestDriver {

    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new TargetFactory().createInstance(configuration().browser());
    }

    @Test
    public void testDriver(){
        driver.get(configuration().url());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
