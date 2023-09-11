package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class ChromeRunner {
    @BeforeClass
            (description = "ბრაუზერის გამართვა და გახსნა")
    public void setup() {
        open("https://megatechnica.ge/ge");
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 5000;
    }

    @AfterClass(description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}

