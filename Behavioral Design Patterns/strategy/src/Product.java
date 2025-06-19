public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice(MembershipType membershipType) {
        if (membershipType.equals(MembershipType.REGULAR)) {
            return price ;
        }else if (membershipType.equals(MembershipType.GOLD)) {
            return price * 0.7;
        }else if (membershipType.equals(MembershipType.SLIVER)) {
            return price * 0.8;
        }else if (membershipType.equals(MembershipType.BRONZE)) {
            return price * 0.9;
        }
        return price ;
    }
}
