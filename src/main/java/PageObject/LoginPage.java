package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public SelenideElement
            myProfile = $("#account"),
            emailInPut = $("#email"),
            passwordInput = $("#password"),
            getLogInButton = $$(byValue("შესვლა")).last(),
            errorMessage = $("#error"),
            myProfileInfo = $(".email"),
            myProfileAfterLogIn = $("#my_account");
}
