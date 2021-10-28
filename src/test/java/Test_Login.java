import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Login extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;

    @Test
    @Order(1)
    public void selectLogin(){
        homePage = new HomePage(driver);
        homePage.goToLogin();

    }

    @Test
    @Order(2)
    public void fillLoginInfo(){
        loginPage = new LoginPage(driver);
        loginPage.fillMail("nohut.kursat@gmail.com");
        loginPage.waitSecond(3000);
        loginPage.fillPassword("qwerty123");
    }

    @Test
    @Order(3)
    public void selectLoginButton(){
        loginPage.loginButton();

    }

}
