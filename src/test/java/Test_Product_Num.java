import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Product_Num extends BaseTest{
    CartPage cartPage;

    @Test
    @Order(1)
    public void productNumTo2(){
        cartPage.productNumUp();
    }

}
