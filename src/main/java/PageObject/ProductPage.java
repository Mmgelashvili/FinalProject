package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    public SelenideElement
            searchInput = $("#searchkey"),
            textInput = $("#searchkey"),
            getSearchButton = $(byName("submit")),
            slaiderMin = $(byAttribute("name", "min_price")),
            slaiderMax = $(byAttribute("name", "max_price")),
            myExactPrice = $(byName( "price"));

    public ElementsCollection productList = $$(".price");

}
