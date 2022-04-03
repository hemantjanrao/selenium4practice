package com.hjanrao.driver;

import org.openqa.selenium.WebDriver;

import static com.hjanrao.config.ConfigurationManager.configuration;

public class TargetFactory {

    public WebDriver createInstance(String browser) throws IllegalStateException {
        Target target = Target.valueOf(configuration().target().toUpperCase());
        WebDriver webdriver;

        switch (target) {
            case LOCAL:
                webdriver = BrowserFactory.valueOf(browser.toUpperCase()).createDriver();
                break;
            case REMOTE:
                webdriver = null;
                break;
            default:
                throw new IllegalStateException("ERROR");
        }

        return webdriver;
    }

    enum Target {
        LOCAL, REMOTE
    }
}
