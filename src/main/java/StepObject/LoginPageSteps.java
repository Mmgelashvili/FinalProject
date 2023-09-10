package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class LoginPageSteps extends LoginPage {
    @Step("ჩემ პროფილზე გვერდზე გადასვლა")
    public LoginPageSteps goToMyProfile() {
        myProfile.click();
        return this;
    }

    @Step("ელ.ფოსტის ველის შევსება მნიშვნელობით: {eMail}")
    public LoginPageSteps fillEmail(String Email) {
        emailInPut.setValue(Email);
        return this;
    }

    @Step("პაროლის ველის შევსება მნიშვნელობით: {Password}")
    public LoginPageSteps fillPassword(String Password) {
        passwordInput.setValue(Password);
        return this;
    }

    @Step("შესვლის ღილაკზე დაჭერა")
    public LoginPageSteps clickLoginButton() {
        getLogInButton.click();
        return this;
    }

    @Step("ერორ მესიჯის წამოღება")
    public String getErrorMessage() {
        errorMessage.shouldBe(Condition.visible, Duration.ofSeconds(3));
        return errorMessage.getText();
    }

    @Step("პროფილის იმეილის წამოღება")
    public String getProfileEmailAddress() {
        myProfileInfo.shouldBe(Condition.visible, Duration.ofSeconds(3));
        return myProfileInfo.getText();
    }

    @Step("ჩემი პროფილის გვერდზე გადასვლა")
    public LoginPageSteps goToMyProfileAfterLogIn() {
        myProfileAfterLogIn.click();
        return this;
    }

}
