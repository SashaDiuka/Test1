import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver webDriver;
    private String pswd = "dthftj87";
    private String email = "sasha.d1uka@gmail.com";


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(css = "#passwd")
    WebElement pswdField;

    @FindBy(css = "#SubmitLogin > span")
    WebElement submit;

    void login(){
        emailField.sendKeys(email);
        pswdField.sendKeys(pswd);
        submit.click();
    }
}


