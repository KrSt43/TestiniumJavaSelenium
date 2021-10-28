import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.id("pd_add_to_cart");
    By pickSizeLocator = By.xpath("//*[@id=\"option-size\"]/a[3]");
    By cartContainerLocator = By.xpath("//*[@id=\"divCartSlider\"]/div/div[3]/a");
    /*By cartContainerLocator = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a");*/

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        waitSecond(6000);
        click(addToCartButtonLocator);
    }

    public void selectSize() {
       click(pickSizeLocator);
       waitSecond(3000);
    }
    public void goToCart() {
        waitSecond(3000);

        click(cartContainerLocator);
    }



}
