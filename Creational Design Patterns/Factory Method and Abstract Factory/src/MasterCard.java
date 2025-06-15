public class MasterCard extends InternationalPaymentMethod {


    public MasterCard(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("MasterCard authorizePayment");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("MasterCard startMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("MasterCard calculatePaymentFees");
    }
}
