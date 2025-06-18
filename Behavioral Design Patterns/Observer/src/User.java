public class User {

    private String name;

    private boolean isSubscribedToProducts ;

    private boolean isSubscribedToOffers ;

    public User(String name, boolean isSubscribedToProducts, boolean isSubscribedToOffers) {
        this.name = name;
        this.isSubscribedToProducts = isSubscribedToProducts;
        this.isSubscribedToOffers = isSubscribedToOffers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribedToProducts() {
        return isSubscribedToProducts;
    }

    public void setSubscribedToProducts(boolean subscribedToProducts) {
        isSubscribedToProducts = subscribedToProducts;
    }

    public boolean isSubscribedToOffers() {
        return isSubscribedToOffers;
    }

    public void setSubscribedToOffers(boolean subscribedToOffers) {
        isSubscribedToOffers = subscribedToOffers;
    }

    public void notifiy(Product product) {
        System.out.println("Notified user : "+name + "--> about new product :"+ product.getName());
    }

    public void notifiy(Offer offer) {
        System.out.println("Notified user : "+ name + "--> about new offer :"+ offer.getMessage());
    }
}
