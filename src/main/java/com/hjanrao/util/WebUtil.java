package com.hjanrao.util;

import org.openqa.selenium.WebElement;

public class WebUtil {

    private WebUtil() {
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void enter(WebElement element, final String text){
        element.clear();
        element.sendKeys(text);
    }
}
