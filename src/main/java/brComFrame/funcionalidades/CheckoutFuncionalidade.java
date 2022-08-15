package brComFrame.funcionalidades;
import brComFrame.pages.CheckoutPage;
import brComFrame.util.BaseTest;

public class CheckoutFuncionalidade extends BaseTest {

    private CheckoutPage checkout;

    public CheckoutFuncionalidade() {
        this.checkout = new CheckoutPage(webDriver);
    }

    public void CheckoutCheck() {
        checkout.getToCheckout().click();
        checkout.getToCheckoutSumary().click();
        checkout.getToCheckoutAdress().click();
        checkout.getTerms().click();
        checkout.getToCheckoutShipping().click();
        checkout.getBankWire().click();
        checkout.getSubmitCheckout().click();
    }

    public void CheckoutBank() {
        checkout.getToCheckout().click();
        checkout.getToCheckoutSumary().click();
        checkout.getToCheckoutAdress().click();
        checkout.getTerms().click();
        checkout.getToCheckoutShipping().click();
        checkout.getCheque().click();
        checkout.getSubmitCheckout().click();
    }

    public void ConfirmCheckout(){
        checkout.getConfirmCheckout().getText();
    }


}
