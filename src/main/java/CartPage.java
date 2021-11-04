import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productNameLocator = By.className("shoppingcart-item");
    By productNumLocator = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div/input");
    By emptySpace = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By deleteProductLocator = By.className("fa fa-trash-o");
    By deleteButtonLocator = By.xpath("//*[@id=\"Cart_ProductDelete_693913857\"]");
    By cartPrice = By.className("rd-cart-item-price mb-15");

    public CartPage(WebDriver driver) {
        super(driver);
    }



    private List<WebElement> getProducts(){
        return  findAll(productNameLocator);
    }

    public void productNumUp(){
        waitSecond(3000);
        click(productNumLocator);
        type(productNumLocator,"2+");
        waitSecond(3000);
        click(emptySpace);

        waitSecond(6000);
    }

    public void productDelete(){
        waitSecond(3000);
        click(deleteProductLocator);
        waitSecond(3000);
        click(deleteButtonLocator);
    }
    public int productPriceOnCart(){
        return Integer.parseInt(findText(cartPrice));
    }
}
