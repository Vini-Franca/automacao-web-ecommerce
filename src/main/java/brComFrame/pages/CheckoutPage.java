package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginBtn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenProduct;

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

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement toCheckout;

    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    private WebElement toCheckoutSumary;

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement toCheckoutAdress;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement toCheckoutShipping;

    @FindBy(xpath = "//input[@name='cgv']")
    private WebElement terms;

    @FindBy(xpath = "//a[@class='bankwire']")
    private WebElement bankWire;

    @FindBy(xpath = "//a[@class='cheque']")
    private WebElement cheque;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement submitCheckout;

    @FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
    private WebElement confirmCheckout;


//    @FindBy(xpath = "//*[contains(text(),'Your registration completed')]")
//    private WebElement msgConfirm;
//    @FindBy(xpath = "//div[@class='validation-summary-errors']//child::span")
//    private WebElement msgError;
//    @FindBy(xpath = "//input[@class='button-1 newsletter-subscribe-button']")
//    private WebElement newslleterSubmit;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getBankWire() {
        return bankWire;
    }

    public WebElement getToCheckoutShipping() {
        return toCheckoutShipping;
    }

    public WebElement getConfirmCheckout() {
        return confirmCheckout;
    }

    public WebElement getToCheckoutAdress() {
        return toCheckoutAdress;
    }

    public WebElement getToCheckoutSumary() {
        return toCheckoutSumary;
    }

    public WebElement getSubmitCheckout() {
        return submitCheckout;
    }

    public WebElement getCheque() {
        return cheque;
    }

    public WebElement getTerms() {
        return terms;
    }

    public WebElement getToCheckout() {
        return toCheckout;
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
