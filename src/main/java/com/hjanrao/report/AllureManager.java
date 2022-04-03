package com.hjanrao.report;

import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import com.hjanrao.driver.DriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.TakesScreenshot;

import static com.hjanrao.config.ConfigurationManager.configuration;
import static org.openqa.selenium.OutputType.BYTES;

public class AllureManager {
    private AllureManager() {
    }

    public static void setAllureEnvironmentInformation(){
        AllureEnvironmentWriter.allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Test URL", configuration().url())
                        .put("Browser", configuration().browser())
                        .build()
        );
    }

    @Attachment
    public static byte[]takeScreenshot(){
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(BYTES);
    }
}
