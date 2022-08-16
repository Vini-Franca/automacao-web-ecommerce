package brComFrame.funcionalidades;

import brComFrame.pages.CadastroPage;
import brComFrame.util.BaseTest;
import org.junit.Assert;

public class CadastroFuncionalidade extends BaseTest {

    private CadastroPage user;

    public CadastroFuncionalidade() {
        this.user = new CadastroPage(webDriver);
    }

    public void HomePage() {
        this.webDriver.get("http://automationpractice.com/index.php");
        String URL = webDriver.getCurrentUrl();
        Assert.assertEquals(URL, "http://automationpractice.com/index.php");
    }

    public void SignupUser() throws InterruptedException {
        user.getLogin().click();
        user.getEmailCreate().sendKeys("teste005@teste.com.br");
        user.getSubmitCreate().click();
        user.getTitle().click();
        user.getFirstname().sendKeys("João");
        user.getLastname().sendKeys("Gomes");
        user.getPassword().sendKeys("teste123");
        user.getDay().click();
        user.getMonth().click();
        user.getYear().click();
        user.getNewslleter().click();
        user.getNewslleter().click();
        user.getAddress().sendKeys("Rua Barão de Itapetininga");
        user.getCity().sendKeys("Denver");
        user.getState().click();
        user.getPostcode().sendKeys("12345");
        user.getPhone().sendKeys("58024922");
    }

    public void LoginBtn() {
        user.getLoginBtn().click();
    }

    public void Credentials() {
        user.getEmail().sendKeys("teste005@teste.com.br");
        user.getPassword().sendKeys("teste123");
        user.getSubmitLogin().click();
    }

    public void LogoutBtn() {
        user.getLogoutBtn().click();
    }

    public void NewsletterEmail() {
        user.getNewsletterInput().sendKeys("teste005@teste.com.br");
    }

    public void NewsletterButton() {
        user.getNewsletterButton().click();
    }

    public void NewsletterConfirm() {
        user.getNewsletterConfirm().getText();
    }

    public void LoginConfirm(String confirm) {
        user.getConfirmAccount().getText();
    }

    public void SubmitRegister() {
        user.getSubmitAccount().click();
    }

    public void RegisterConfirm() {
        user.getConfirmAccount().getText();
    }

    public void emailValidation() {
        user.getEmailCreate().sendKeys("");
        user.getSubmitCreate().click();
    }

    public void emailValidationMsg(String msgEmail) {
        user.getInvalidEmail().getText();
    }

    public void invalidForm(String arg0) {
        user.getInvalidForm().getText().contains(arg0);

    }

    public void validEmail() {
        user.getEmailCreate().sendKeys("teste010@teste.com.br");
        user.getSubmitCreate().click();
    }




}
