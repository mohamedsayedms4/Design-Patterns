//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OnlineMarketplace marketplace = new OnlineMarketplace();

        Customer customer = new Customer("Ahmed");
        Customer customer2 = new Customer("Mohamed");
        Customer customer3 = new Customer("Mahesh");
        Subscriber customer4 = new JobFinder("Ali");

//        marketplace.subscribe(EventType.NEW_PRODUCT, customer);
//        marketplace.subscribe(EventType.NEW_OFFER, customer);
//
//        marketplace.subscribe(EventType.NEW_OFFER, customer2);
//
//        marketplace.subscribe(EventType.NEW_PRODUCT, customer3);

        marketplace.subscribe(EventType.NEW_JOB, customer4);

        marketplace.addProduct(new Product("Laptop Lenovo",15000));
        marketplace.addProduct(new Product("Laptop MacBook Pro",680000));

        marketplace.addJob(new Job("Backend"));
        marketplace.addOffer(new Offer("50% sale for clothes"));
    }
}