package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginPageSteps extends LoginPage {
    @Step("შესვლის გვერდზე გადასვლა")
    public LoginPageSteps GoToLoginPage() {
        logInButton.click();
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

    @Step("რეგისტრაციის ღილაკზე დაჭერა")
    public LoginPageSteps ClickLoginButton() {
        logInButton.click();
        return this;
    }
}
