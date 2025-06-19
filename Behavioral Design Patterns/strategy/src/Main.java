//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product("laptop",100);
        double price = product.calculatePrice(MembershipType.SLIVER);
        System.out.println(price);

        Checkout checkout = new Checkout();
        checkout.processPayment(price, PaymentMethodType.VISA);
    }
}