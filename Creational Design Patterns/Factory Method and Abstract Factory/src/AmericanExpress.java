public class AmericanExpress extends PaymentMethod{

    public AmericanExpress(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("AmericanExpress authorizePayment");

    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("AmericanExpress startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("AmericanExpress calculatePaymentFees");
    }
}
