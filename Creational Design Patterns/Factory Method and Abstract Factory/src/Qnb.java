public class Qnb extends LocalPaymentMethod{

    public Qnb(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("Qnb authorizePayment");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Qnb startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("Qnb calculatePaymentFees");
    }
}
