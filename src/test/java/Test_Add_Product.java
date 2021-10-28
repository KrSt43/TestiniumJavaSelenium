import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Test_Add_Product extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;


    @Test
    @Order(1)
    public void selectLogin(){

        homePage = new HomePage(driver);
        homePage.waitSecond(3000);
        homePage.goToLogin();

    }

    @Test
    @Order(2)
    public void fillLoginInfo(){
        loginPage = new LoginPage(driver);
        loginPage.waitSecond(3000);
        loginPage.fillMail("nohut.kursat@gmail.com");
        loginPage.waitSecond(3000);
        loginPage.fillPassword("qwerty123");
    }

    @Test
    @Order(3)
    public void selectLoginButton(){
        loginPage.waitSecond(3000);
        loginPage.loginButton();
        Assertions.assertEquals(homePage.getText(),"Hesabım");

    }

    @Test
    @Order(4)
    public void search_product(){


        homePage.waitSecond(6000);
        homePage.searchBox().search("Pantolon");

    }

    @Test
    @Order(5)
    public void select_product(){
        productsPage = new ProductsPage(driver);
        productsPage.scrollProduct();
        productsPage.selectMoreProduct();
        productsPage.waitSecond(6000);
        productsPage.selectProduct(1);

    }

    @Test
    @Order(6)
    public void add_product(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.waitSecond(3000);
        productDetailPage.selectSize();

        productDetailPage.addToCart();
        productDetailPage.waitSecond(3000);

    }

    @Test
    @Order(7)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        productDetailPage.goToCart();
        cartPage.waitSecond(3000);



    }
    @Test
    @Order(8)
    public void num_up(){
        cartPage.waitSecond(3000);
        cartPage.productNumUp();
        cartPage.waitSecond(6000);
    }

    @Test
    @Order(9)
    public void delete_product(){
        cartPage.waitSecond(3000);
        cartPage.productDelete();
    }
}
