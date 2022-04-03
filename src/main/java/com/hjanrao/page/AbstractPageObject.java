package com.hjanrao.page;

import com.hjanrao.driver.DriverManager;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static com.hjanrao.config.ConfigurationManager.configuration;
import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class AbstractPageObject {
    protected AbstractPageObject() {
        initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), configuration().timeout()), this);
    }

}
