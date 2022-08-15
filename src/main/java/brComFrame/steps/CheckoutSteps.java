package brComFrame.steps;

import brComFrame.funcionalidades.CheckoutFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class CheckoutSteps {

    private CheckoutFuncionalidade checkout;


    public CheckoutSteps() {
        this.checkout = new CheckoutFuncionalidade();
    }

    @E("prossigo para finalizar compra por cheque")
    public void prossigoParaFinalizarCompraPorCheque() {
        this.checkout.CheckoutCheck();
    }

    @Entao("devo receber a mensagem {string}")
    public void devoReceberAMensagem(String arg0) {
        this.checkout.ConfirmCheckout();
    }

    @E("prossigo para finalizar compra por trasnferencia bancaria")
    public void prossigoParaFinalizarCompraPorTrasnferenciaBancaria() {
        this.checkout.CheckoutBank();
    }
}

