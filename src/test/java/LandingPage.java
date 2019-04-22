import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    private WebDriver webDriver;

    public LandingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("http://automationpractice.com");
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement sectionDresses;

    @FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
    WebElement signIn;

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    WebElement logOutButton;

    void logOut(){
        logOutButton.click();
    }

    void goToSectionDresses() {
        sectionDresses.click();
    }

    void getSignIn(){
        signIn.click();
    }
}
