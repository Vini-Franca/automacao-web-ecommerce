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

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenProduct;

    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    private WebElement tshirtProduct;

    @FindBy(linkText = "Dresses")
    private WebElement dresses;

    @FindBy(linkText = "Tops")
    private WebElement tops;

    @FindBy(linkText = "Blouses")
    private WebElement blouse;

    @FindBy(xpath = "(//a[@title='Blouse'])[2]")
    private WebElement blouseProduct;

    @FindBy(xpath = "(//a[@title='Printed Summer Dress'])[2]")
    private WebElement dressesProduct;

    @FindBy(xpath = "//a[@name='Black']")
    private WebElement setColorDresses;

    @FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
    private WebElement setQty;

    @FindBy(xpath = "//a[@id='color_14']")
    private WebElement setColor;

    @FindBy(xpath = "//select[@name='group_1']//option[3]")
    private WebElement setSize;

    @FindBy(xpath = "//select[@name='group_1']//option[2]")
    private WebElement setSizeDresses;

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

    public WebElement getWomenProduct() {
        return womenProduct;
    }

    public WebElement getBlouse() {
        return blouse;
    }

    public WebElement getBlouseProduct() {
        return blouseProduct;
    }

    public WebElement getTops() {
        return tops;
    }

    public WebElement getSetSizeDresses() {
        return setSizeDresses;
    }

    public WebElement getSetColorDresses() {
        return setColorDresses;
    }

    public WebElement getSetQty() {
        return setQty;
    }

    public WebElement getDresses() {
        return dresses;
    }

    public WebElement getDressesProduct() {
        return dressesProduct;
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
