import StepObject.AddToBagSteps;
import Utils.ChromeRunner;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static DataObject.AddToBagData.*;

public class AddToBagTest extends ChromeRunner {
    AddToBagSteps bagList = new AddToBagSteps();

    @Test
    @Description("ნივთის კალათაში დამატება")
    public void bagList(){
        bagList
                .printMyText(myProduct)
                .clickSearchButton()
                .chooseMobile()
                .addMyProduct()
                .increaseProduct(myQuantity)
                .goToBag();
    }


}
