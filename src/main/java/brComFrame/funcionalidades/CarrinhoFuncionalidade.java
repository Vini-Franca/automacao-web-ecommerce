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
        user.getEmail().sendKeys("teste005@teste.com.br");
        user.getPassword().sendKeys("teste123");
        user.getSubmitLogin().click();
    }

    public void addCart() {
        user.getWomenProduct().click();
        user.getTshirtProduct().click();
        user.getSetColor().click();
        user.getSetSize().click();
        user.getAddToCart().click();
    }

    public void addDress() {
        user.getWomenProduct().click();
        user.getDresses().click();
        user.getDressesProduct().click();
        user.getSetColorDresses().click();
        user.getSetQty().click();
        user.getSetSizeDresses().click();
        user.getAddToCart().click();
    }

    public void addBlouse() {
        user.getWomenProduct().click();
        user.getTops().click();
        user.getBlouse().click();
        user.getBlouseProduct().click();
        user.getSetQty().click();
        user.getSetQty().click();
        user.getAddToCart().click();
    }

    public void MsgCart(){
        user.getCartConfirm().getText().equals("Product successfully added to your shopping cart");
    }


}
