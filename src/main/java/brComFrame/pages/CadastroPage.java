package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    @FindBy(className = "login")
    private WebElement login;

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreate;

    @FindBy(id = "id_gender1")
    private WebElement title;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(xpath = "//select[@id='days']/option[12]")
    private WebElement day;

    @FindBy(xpath = "//select[@id='months']/option[3]")
    private WebElement month;

    @FindBy(xpath = "//select[@id='years']/option[28]")
    private WebElement year;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement newslleter;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//select[@id='id_state']/option[6]")
    private WebElement state;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postcode;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement phone;

    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement submitAccount;

    @FindBy(xpath = "//*[contains(text(),'Welcome to your account.')]")
    private WebElement confirmAccount;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logoutBtn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(xpath = "//input[@id='newsletter-input']")
    private WebElement newsletterInput;

    @FindBy(xpath = "//button[@name='submitNewsletter']")
    private WebElement newsletterButton;

    @FindBy(xpath = "(//*[contains(text(),'Newsletter : You have successfully subscribed to this newsletter.')])[2]")
    private WebElement newsletterConfirm;

    @FindBy(xpath = "//*[contains(text(),'Invalid email address.')]")
    private WebElement invalidEmail;

    @FindBy(xpath = "//div[@class='alert alert-danger']//child::p")
    private WebElement invalidForm;






//    @FindBy(xpath = "//*[contains(text(),'Your registration completed')]")
//    private WebElement msgConfirm;
//    @FindBy(xpath = "//div[@class='validation-summary-errors']//child::span")
//    private WebElement msgError;
//    @FindBy(xpath = "//input[@class='button-1 newsletter-subscribe-button']")
//    private WebElement newslleterSubmit;

    public CadastroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getNewsletterConfirm() {
        return newsletterConfirm;
    }

    public WebElement getInvalidForm() {
        return invalidForm;
    }

    public WebElement getInvalidEmail() {
        return invalidEmail;
    }

    public WebElement getNewsletterInput() {
        return newsletterInput;
    }

    public WebElement getNewsletterButton() {
        return newsletterButton;
    }

    public WebElement getConfirmAccount() {
        return confirmAccount;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getSubmitLogin() {
        return submitLogin;
    }

    public WebElement getSubmitAccount() {
        return submitAccount;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getNewslleter() {
        return newslleter;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getPostcode() {
        return postcode;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getDay() {
        return day;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getEmailCreate() {
        return emailCreate;
    }

    public WebElement getSubmitCreate() {
        return submitCreate;
    }

    public WebElement getTitle() {
        return title;
    }

}
