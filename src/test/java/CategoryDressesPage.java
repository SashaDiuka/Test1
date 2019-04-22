import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class CategoryDressesPage {
    private WebDriver webDriver;
    private String categoryNameText = "Dresses";

    public String getCategoryNameText() {
        return categoryNameText;
    }

    public CategoryDressesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
    }

    @FindBy(className = "category-name")
    WebElement categoryName;

    @FindBy(css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a")
    WebElement subcategoryCasualDresses;

    @FindBy(css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a")
    WebElement subcategoryEveningDresses;

    @FindBy(css = "#subcategories > ul > li:nth-child(3) > div.subcategory-image > a")
    WebElement subcategorySummerDresses;

    @FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > h5 > a")
    WebElement printedSummerDressProduct;

    @FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > h5 > a")
    WebElement printedChiffonDressProduct;

    @FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    WebElement printedDressProduct;

    @FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
    WebElement addToCartButton;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    WebElement proceedToCheckoutButton;

    public void addToCartProduct(WebElement webElement) {
        webElement.click();
        goToCheckCart();
    }

    public void goToCheckCart() {
        while (!proceedToCheckoutButton.isDisplayed()){
        };
        proceedToCheckoutButton.click();
    }
}
