package StepObject;

import PageObject.AddToBagPage;
import com.codeborne.selenide.Condition;
import com.thoughtworks.qdox.model.expression.Add;
import io.qameta.allure.Step;

public class AddToBagSteps extends AddToBagPage {

    @Step("სერჩის ველის შევსება მნიშვნელობით: {ტელეფონი}")
    public AddToBagSteps printMyText(String text1) {
        searchText.setValue(text1);
        return this;
    }

    @Step("სერჩის ველზე დაკლიკება")
    public AddToBagSteps clickSearchButton() {
        goToSearchButton.click();
        return this;
    }

    @Step("მობილურზე გადასვლა")
    public AddToBagSteps chooseMobile() {
        goToMobilePage.click();
        return this;
    }

    @Step("პროდუქტის დამატება კალათაში")
    public AddToBagSteps addMyProduct() {
        addToBag.click();
        return this;
    }

    @Step("არჩეული პროდუქტი ემატება კალათაში")
    public AddToBagSteps youAreOnCartPage() {
        myCart.shouldBe(Condition.visible);
        return this;
    }

    @Step("დამატებული ნივთის ფასის შემოწმება")
    public String getProductTotalPrice() {
        return productTotalPrice.getText();
    }

    @Step("დამატებული ნივთის ფასის შედარება")
    public String getProductCheckoutPrice() {
        return productCheckoutPrice.getText();
    }

    @Step("total text")
    public String getTotalText() {
        return totalProduct.getText();
    }

    @Step("დამატებული პროდუქტის წაშლა")
    public AddToBagSteps deleteAddedProduct() {
        deleteProduct.click();
        return this;
    }

}