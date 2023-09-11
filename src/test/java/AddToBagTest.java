import StepObject.AddToBagSteps;
import Utils.ChromeRunner;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.AddToBagData.*;

public class AddToBagTest extends ChromeRunner {
    AddToBagSteps bagList = new AddToBagSteps();

    @Test(priority = 1)
    @Description("ნივთის კალათაში დამატება")
    public void bagList() {
        bagList
                .printMyText(myProduct)
                .clickSearchButton()
                .chooseMobile()
                .addMyProduct();
        Assert.assertEquals(bagList.getProductTotalPrice(), bagList.getProductCheckoutPrice());
    }

    @Test(priority = 2)
    @Description("კალათასი არსებული ნივთის შემოწმება")
    public void buscetInfo() {
        bagList
                .youAreOnCartPage()
                .getTotalText();
        Assert.assertTrue(bagList.getTotalText().contains("სულ (1 ნივთი)"));
    }

    @Test(priority = 3)
    @Description("ნივთის წაშლა კალათიდან")
    public void increaseQuantity() {
        bagList
                .deleteAddedProduct();
        Assert.assertTrue(bagList.getTotalText().contains("სულ (0 ნივთი)"));
    }


}
