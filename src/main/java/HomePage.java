import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox;
    By clickLoginLocator = By.className("dropdown-toggle");
    By isAccountLoggedLocator = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[1]/div[1]/div/a/div");



    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public void goToLogin(){
        click(clickLoginLocator);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }
    public String getText(){
        return findText(isAccountLoggedLocator);
    }



}
