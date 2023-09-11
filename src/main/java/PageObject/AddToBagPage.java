package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddToBagPage {
    public SelenideElement

            searchText = $("#searchkey"),
            goToSearchButton = $(byName("submit")),
            goToMobilePage = $$(".img_link").first(),
            addToBag = $(".add_to_bag"),
            deleteProduct = $(".delete"),
            myCart = $(".cart"),
            totalProduct = $(".total"),
            productTotalPrice = $(byXpath("//div[@class = 'total']//span")),
            productCheckoutPrice = $(byXpath("//div[@class = 'prices']//span[@class = 'price']"));
}
