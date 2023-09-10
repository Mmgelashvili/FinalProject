import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps logIn = new LoginPageSteps();
    LoginPageSteps inCorrectLogIn = new LoginPageSteps();

    @Test
    @Description("პოზიტიული დალოგინების სცენარი")
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

