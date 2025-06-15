public class Alex extends LocalPaymentMethod{

    public Alex(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("Alex authorizePayment");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Alex startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("Alex calculatePaymentFees");
    }
}
