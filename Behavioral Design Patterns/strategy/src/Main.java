//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product("laptop",100 , new BronzePricing());
        double price = product.calculatePrice();
        System.out.println(price);

        Checkout checkout = new Checkout(new VisaCardPaymentStrategy());
        checkout.processPayment(price);
    }
}