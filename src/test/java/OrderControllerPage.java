import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderControllerPage {
    private WebDriver webDriver;

    public String getCartProductDescription() {
        return cartProductDescription.getText();
    }

    public OrderControllerPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("http://automationpractice.com/index.php?controller=order");
    }

    @FindBy(css=".cart_description > .product-name > a")
    WebElement cartProductDescription;

    public void goToCartDescription(){
        cartProductDescription.click();
    }
}
