package Utils;

import org.testng.annotations.BeforeMethod;

import static jdk.internal.misc.ThreadFlock.open;

public class ChromeRunner {
    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public void setUp() {
        open("https://upway.ge/");
    }
}