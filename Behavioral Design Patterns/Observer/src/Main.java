//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OnlineMarketplace marketplace = new OnlineMarketplace();
        marketplace.addUser(new User("ahmed",true,true));
        marketplace.addUser(new User("Mahmoud",false,true));
        marketplace.addUser(new User("Ali",true,false));
        marketplace.addUser(new User("Ola",false,false));

        marketplace.addProduct(new Product("Laptop Lenovo",15000));
        marketplace.addProduct(new Product("Laptop MacBook Pro",680000));

        marketplace.addOffer(new Offer("50% sale for clothes"));
    }
}