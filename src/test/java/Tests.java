import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Tests {
    private static WebDriver webDriver;

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "/home/grind3x/Стільниця/D1uka_Studing/MyCSS/chromedriver");
        webDriver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(webDriver);
        PageFactory.initElements(webDriver, loginPage);
        loginPage.login();
    }

    @Test
    public void testLandingPage() {
        LandingPage landingPage = new LandingPage(webDriver);
        CategoryDressesPage dressesPage = new CategoryDressesPage(webDriver);
        PageFactory.initElements(webDriver, dressesPage);
        PageFactory.initElements(webDriver, landingPage);
        landingPage.sectionDresses.click();
        Assert.assertEquals(dressesPage.categoryName.getText(), dressesPage.getCategoryNameText());
    }

    @Test
    public void testOrderCart() {
        CategoryDressesPage dressesPage = new CategoryDressesPage(webDriver);
        PageFactory.initElements(webDriver, dressesPage);
        dressesPage.addToCartProduct(dressesPage.printedDressProduct);
        OrderControllerPage orderControllerPage = new OrderControllerPage(webDriver);
        PageFactory.initElements(webDriver, orderControllerPage);
        Assert.assertEquals("Printed Dress", orderControllerPage.getCartProductDescription());
    }

    @AfterClass
    public static void exit() {
        LandingPage landingPage = new LandingPage(webDriver);
        PageFactory.initElements(webDriver, landingPage);
        landingPage.logOut();
        webDriver.quit();
    }
}
