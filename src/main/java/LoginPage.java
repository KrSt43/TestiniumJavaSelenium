import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    static Logger log = Logger.getLogger(LoginPage.class);


    By mailLocator = By.id("LoginEmail");
    By passwordLocator = By.id("Password");
    By loginButtonLocator = By.xpath("//*[@id=\"loginLink\"]");


    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void fillMail(String text){
        log.info("Mail filled ");
        click(mailLocator);
        type(mailLocator,text);
    }

    public void fillPassword(String text){
        log.info("password filled");
        click(passwordLocator);
        type(passwordLocator,text);
    }

    public void loginButton(){
        log.info("clicked on login button");
        waitSecond(3000);
        click(loginButtonLocator);

    }

}
