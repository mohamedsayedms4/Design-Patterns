public class Checkout {

    public void processPayment(double amount ,  PaymentMethodType paymentMethod) {
        if (paymentMethod.equals(PaymentMethodType.VISA)) {
            System.out.println("Visa payment is accepted");
            System.out.println("calculating fees of the amount of visa");
        }else if (paymentMethod.equals(PaymentMethodType.MASTERCARD)) {
            System.out.println("Mastercard payment is accepted");
            System.out.println("calculating fees of the amount of `mastercard`");
        }else if (paymentMethod.equals(PaymentMethodType.BANKCARD)) {
            System.out.println("Bank payment is accepted");
        }
    }
}
