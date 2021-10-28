import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By productNameLocator = By.className("product-item-wrapper");
    By moreProductButtonLocator = By.className("lazy-load-button");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void scrollProduct(){
        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
        jse6.executeScript("window.scrollBy(0,10000)", "");
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return  findAll(productNameLocator);
    }
    public void selectMoreProduct(){
        click(moreProductButtonLocator);
    }
}
