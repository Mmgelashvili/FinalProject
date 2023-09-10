package StepObject;

import PageObject.ProductPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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
        slaiderMin.shouldBe(Condition.visible, Duration.ofSeconds(10)).setValue(String.valueOf(lowPrice));
        return this;
    }

    @Step("მაქსიმალური ფასის გაფილტვრა")
    public ProductPageSteps clickmaxPrice(int maximumPrice) {
        slaiderMax.shouldBe(Condition.visible, Duration.ofSeconds(10)).setValue(String.valueOf(maximumPrice));
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

    @Step("დაფილტრულზე დაბალი ფასის გადაცემა")
    public ProductPageSteps getcheaperproduct(int myPrice) {
        myExactPrice.click();
        return this;
    }

}