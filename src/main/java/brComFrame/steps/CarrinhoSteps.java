package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import brComFrame.funcionalidades.CarrinhoFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CarrinhoSteps {

    private CarrinhoFuncionalidade cart;


    public CarrinhoSteps() {
        this.cart = new CarrinhoFuncionalidade();
    }

    @Dado("que estou na home page")
    public void queEstouNaHomePage() {
        this.cart.HomePage();
    }

    @E("faço login com meu email e senha")
    public void façoLoginComMeuEmailESenha() {
        this.cart.Login();
    }

    @Quando("adiciono um produto ao carrinho")
    public void adicionoUmProdutoAoCarrinho() {
       this.cart.addCart();
    }

    @Entao("devo visualizar {string}")
    public void devoVisualizar(String cartMsg) {
        this.cart.MsgCart();
    }

    @Quando("adiciono um vestido ao carrinho")
    public void adicionoUmVestidoAoCarrinho() {
        this.cart.addDress();
    }

    @Quando("adiciono uma blusa ao carrinho")
    public void adicionoUmaBlusaAoCarrinho() {
        this.cart.addBlouse();
    }
}

