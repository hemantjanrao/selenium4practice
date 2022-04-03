package com.hjanrao.pages.login;

import com.hjanrao.page.AbstractPageObject;
import com.hjanrao.util.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageObject {

    @FindBy(id="email")
    private WebElement inputEmail;

    @FindBy(id="passwd")
    private WebElement inputPasswd;

    @FindBy(id="SubmitLogin")
    private WebElement btnSubmit;

    public void Login(final String email, final String password){
        WebUtil.enter(inputEmail, email);
        WebUtil.enter(inputPasswd, password);
        WebUtil.click(btnSubmit);
    }
}
