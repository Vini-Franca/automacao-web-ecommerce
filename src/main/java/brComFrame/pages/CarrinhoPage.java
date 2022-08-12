package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginBtn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(xpath = "//a[@title='T-shirts']")
    private WebElement tshirts;

    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    private WebElement tshirtProduct;

    @FindBy(xpath = "//a[@id='color_14']")
    private WebElement setColor;

    @FindBy(xpath = "//select[@name='group_1']//option[3]")
    private WebElement setSize;

    @FindBy(xpath = "//button[@name='Submit']")
    private WebElement addToCart;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//child::h2")
    private WebElement cartConfirm;

//    @FindBy(xpath = "//*[contains(text(),'Your registration completed')]")
//    private WebElement msgConfirm;
//    @FindBy(xpath = "//div[@class='validation-summary-errors']//child::span")
//    private WebElement msgError;
//    @FindBy(xpath = "//input[@class='button-1 newsletter-subscribe-button']")
//    private WebElement newslleterSubmit;

    public CarrinhoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getTshirts() {
        return tshirts;
    }

    public WebElement getTshirtProduct() {
        return tshirtProduct;
    }

    public WebElement getSetColor() {
        return setColor;
    }

    public WebElement getSetSize() {
        return setSize;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getCartConfirm() {
        return cartConfirm;
    }


    public WebElement getEmail() {
        return email;
    }


    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getSubmitLogin() {
        return submitLogin;
    }

    public WebElement getPassword() {
        return password;
    }


}
