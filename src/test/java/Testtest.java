import Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class Testtest extends ChromeRunner {

    @Test
    public void autotest() {
        Configuration.baseUrl = "https://upway.ge/;";
        Configuration.browserSize = "1900x1200";
        open("https://upway.ge/");

        $(byText("შესვლა")).click();
        $(byClassName("rhicon rhi-sign-in")).click();
        $(byId("eMail")).setValue("gelashvili99@gmail.com");
        $(byId("Password")).setValue("Gelashvili23.");
        $(byText("შესვლა")).click();
        sleep(5000);


    }
}