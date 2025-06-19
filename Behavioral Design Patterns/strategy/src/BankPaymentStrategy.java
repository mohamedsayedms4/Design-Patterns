public class BankPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Mastercard payment is accepted");
        System.out.println("calculating fees of the amount of `mastercard`");
    }
}
