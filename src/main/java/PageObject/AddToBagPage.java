package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class AddToBagPage {
    public SelenideElement

            searchText = $("#searchkey"),
            goToSearchButton = $(byName("submit")),
            goToMobilePage= $(byName("itemListElement")),

            addToBag = $(byName("add_to_bag")),
            buyButton = $(byName("buy")),
            addMoreProduct = $(byAttribute("Name", "quantity")),
            bagButton = $("#bag");
}
