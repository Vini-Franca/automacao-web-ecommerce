package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroSteps {

    private CadastroFuncionalidade user;


    public CadastroSteps() {
        this.user = new CadastroFuncionalidade();
    }

    @Dado("que estou na página inicial")
    public void queEstouNaPáginaInicial() {
        this.user.HomePage();
    }

    @E("preencho o formulário de cadastro")
    public void preenchoOFormulárioDeCadastro() throws InterruptedException {
        this.user.SignupUser();
    }

    @Quando("envio o formulário")
    public void envioOFormulário() {
        this.user.SubmitRegister();
    }

    @Entao("devo visualizar a mensagem {string}")
    public void devoVisualizarAMensagem(String register) {
        this.user.RegisterConfirm();
    }

    @E("clico em login")
    public void clicoEmLogin() {
       this.user.LoginBtn();
    }

    @Quando("preencho e envio minhas credenciais")
    public void preenchoEEnvioMinhasCredenciais() {
        this.user.Credentials();
    }

    @Entao("devo visualizar {string} no cabeçalho da página")
    public void devoVisualizarNoCabeçalhoDaPágina(String confirm) {
        this.user.LoginConfirm(confirm);
    }

    @Quando("insiro meu email para assinar a newsletter")
    public void insiroMeuEmailParaAssinarANewsletter() {
    }

    @Entao("devo visualizar um texto com a confirmação")
    public void devoVisualizarUmTextoComAConfirmação() {}

    @E("faço o login com minhas credenciais")
    public void façoOLoginComMinhasCredenciais() {
        clicoEmLogin();
        preenchoEEnvioMinhasCredenciais();
    }

    @Quando("clico em Sign Out")
    public void clicoEmSignOut() {
        this.user.LogoutBtn();
    }

    @Entao("devo ser redirecionado a página inicial")
    public void devoSerRedirecionadoAPáginaInicial() {
        queEstouNaPáginaInicial();
    }
}

