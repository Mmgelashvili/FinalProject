import StepObject.ProductPageSteps;
import Utils.ChromeRunner;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static DataObject.ProductPageData.*;

public class ProductPageTest extends ChromeRunner {
    ProductPageSteps filter = new ProductPageSteps();
    ProductPageSteps getCheaperProduct = new ProductPageSteps();

    @Test
    @Description("მობილურების გაფილტვრა ფასით და ფასების მნისვნელობის მიღება")
    public void ProductPage() {
        filter
                .searchInput()
                .printText(searchText)
                .clickSearchButton()
                .clicklowestPrice(lowPrice)
                .clickmaxPrice(maximumPrice)
                .getFilteredProductPrices();

    }

    @Test
    @Description("მხოლოდ სამსუნგის მონაცემების წამოღება")
    public void SamsungProducts(){
        filter
                .searchInput()
                .printText(searchText)
                .clickSearchButton();
        getCheaperProduct
                .checkSamsung()
                .getProductNames();
    }
}