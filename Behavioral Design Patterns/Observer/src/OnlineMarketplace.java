import java.util.ArrayList;
import java.util.List;

public class OnlineMarketplace {

    private List<User> users;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketplace() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addProduct(Product product) {
        this.products.add(product);
        notifyUsers(product);
    }

    public void notifyUsers(Product product) {
       users.forEach(user -> {
           if(!user.isSubscribedToProducts()){
                return;
           }
           user.notifiy(product);
       });
    }

    public void notifyUsers(Offer offer) {
        users.forEach(user -> {
            if(!user.isSubscribedToOffers()){
                return;
            }
            user.notifiy(offer);
        });
    }

    public void addOffer(Offer offer) {
        this.offers.add(offer);
        notifyUsers(offer);
    }

}
