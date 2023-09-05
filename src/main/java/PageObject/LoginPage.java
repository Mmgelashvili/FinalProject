package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            logInButton = $("rhicon rhi-sign-in"),
            emailInPut = $(byName("loginmail")),
            passwordInput = $(byAttribute("rehub_user_pass", "პაროლი")),
            getLogInButton = $(byValue("შესვლა"));
}
