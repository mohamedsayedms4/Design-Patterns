//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PaymentProcessor paymentProcessor = new PaymentProcessor(new LoaclPaymentMethodFactory());
        paymentProcessor.processPayment(CardTypes.QNB,"Mahmoud",100,"123","550","12-27");
    }
}