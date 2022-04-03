package com.hjanrao.pages.home;

import com.hjanrao.page.AbstractPageObject;
import com.hjanrao.util.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPageObject { ;

    @FindBy(css = "a.login")
    private WebElement linkLogin;

    public void gotoLoginPage(){
        WebUtil.click(linkLogin);
    }
}
