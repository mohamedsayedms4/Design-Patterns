public class VisaCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Visa payment is accepted");
        System.out.println("calculating fees of the amount of visa");
    }
}
