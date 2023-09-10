package StepObject;

import PageObject.AddToBagPage;
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
    @Step("პროდუქტის რაოდენობის გაზრდა")
    public AddToBagSteps increaseProduct(int myQuantity) {
        addMoreProduct.click();
        return this;
    }
    @Step("კალათაში გადასვლა")
    public AddToBagSteps  goToBag() {
        bagButton.click();
        return this;
    }
}