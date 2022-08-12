package brComFrame.funcionalidades;
import brComFrame.pages.CarrinhoPage;
import brComFrame.util.BaseTest;
import org.junit.Assert;

public class CarrinhoFuncionalidade extends BaseTest {

    private CarrinhoPage user;

    public CarrinhoFuncionalidade() {
        this.user = new CarrinhoPage(webDriver);
    }

    public void HomePage() {
        this.webDriver.get("http://automationpractice.com/index.php");
        String URL = webDriver.getCurrentUrl();
        Assert.assertEquals(URL, "http://automationpractice.com/index.php");
    }

    public void Login() {
        user.getLoginBtn().click();
        user.getEmail().sendKeys("teste003@teste.com.br");
        user.getPassword().sendKeys("teste123");
        user.getSubmitLogin().click();
    }

    public void addCart() {
        user.getTshirts().click();
        user.getTshirtProduct().click();
        user.getSetColor().click();
        user.getSetSize().click();
        user.getAddToCart().click();
    }

    public void MsgCart(){
        user.getCartConfirm().getText().equals("Product successfully added to your shopping cart");

    }


}
