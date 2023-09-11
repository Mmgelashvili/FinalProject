package StepObject;

import PageObject.ProductPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

public class ProductPageSteps extends ProductPage {
    @Step("ძიების ველზე გადასვლა")
    public ProductPageSteps searchInput() {
        searchInput.click();
        return this;
    }

    @Step("სერჩის ველის შევსება მნიშვნელობით: {ტელეფონი}")
    public ProductPageSteps printText(String text1) {
        textInput.setValue(text1);
        return this;
    }

    @Step("სერჩის ველზე დაკლიკება")
    public ProductPageSteps clickSearchButton() {
        getSearchButton.click();
        return this;
    }

    @Step("მინიმალური ფასის გაფილტვრა")
    public ProductPageSteps clicklowestPrice(int lowPrice) {
        slaiderMin.shouldBe(Condition.visible, Duration.ofSeconds(5)).setValue(String.valueOf(lowPrice));
        return this;
    }

    @Step("მაქსიმალური ფასის გაფილტვრა")
    public ProductPageSteps clickmaxPrice(int maximumPrice) {
        slaiderMax.shouldBe(Condition.visible, Duration.ofSeconds(5)).setValue(String.valueOf(maximumPrice));
        return this;
    }

    @Step("გაფილტრული პროდუქტების რაოდენობის ნახვა")
    public ProductPageSteps getFilteredProductPrices() {
        for (SelenideElement ele : productList) {
            String price = ele.getOwnText();
            System.out.println(price);
        }
        return this;
    }

    @Step("სამსუნგის დაფილტვრა")
    public ProductPageSteps checkSamsung(String myMobile) {
        samsungCheckBox.click();
        return this;
    }

    @Step("სახელის შემოწმება")
    public ProductPageSteps getProductNames() {
        for (int i = 0; i < productDescription.size(); i++) {
            String elementText = productDescription.get(i).getText();
            Assert.assertTrue(elementText.contains("Samsung"));
        }
        return this;
    }

}