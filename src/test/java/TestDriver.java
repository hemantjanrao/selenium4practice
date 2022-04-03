import com.hjanrao.driver.BrowserFactory;
import org.testng.annotations.Test;

public class TestDriver {

    @Test
    public void testDriver(){
        BrowserFactory chrome = BrowserFactory.CHROME;
        System.out.println(chrome.createDriver());
    }
}
