package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.FindBy;

public class ValidacaoCadastroSteps {

    private CadastroFuncionalidade user;


    public ValidacaoCadastroSteps() {
        this.user = new CadastroFuncionalidade();
    }

    @Quando("clico em criar conta sem preencher o email")
    public void clicoEmCriarContaSemPreencherOEmail() {
        this.user.emailValidation();
    }

    @Entao("a recebo a mensagem {string}")
    public void aReceboAMensagem(String msgEmail) {
        this.user.emailValidationMsg(msgEmail);
    }

    @Quando("preencho um email válido para prosseguir")
    public void preenchoUmEmailVálidoParaProsseguir() {
        this.user.validEmail();

    }

    @E("envio o formulário sem preencher os campos obrigatórios")
    public void envioOFormulárioSemPreencherOsCamposObrigatórios() {
        this.user.SubmitRegister();
    }

    @Entao("visualizo a mensagem {string}")
    public void visualizoAMensagem(String arg0) {
        this.user.invalidForm(arg0);
    }
}

