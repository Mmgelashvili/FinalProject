import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps logIn = new LoginPageSteps();
    LoginPageSteps inCorrectLogIn = new LoginPageSteps();

    @Test
    @Description("პოზიტიული დალოგინების სცენარი")
    @Severity(SeverityLevel.CRITICAL)
    public void logIn() {
        logIn
                .goToMyProfile()
                .fillEmail(eMail)
                .fillPassword(password)
                .clickLoginButton()
                .goToMyProfile()
                .goToMyProfileAfterLogIn();
        Assert.assertEquals(inCorrectLogIn.getProfileEmailAddress(), eMail);
    }

    @Test
    @Description("ნეგატიური დალოგინების სცენარი")
    @Severity(SeverityLevel.MINOR)
    public void incorrectLogIn() {
        inCorrectLogIn
                .goToMyProfile()
                .fillEmail(eMail)
                .fillPassword(inCorrectPasword)
                .clickLoginButton()
                .getErrorMessage();
        Assert.assertEquals(inCorrectLogIn.getErrorMessage(), errorMessage);

    }
}

