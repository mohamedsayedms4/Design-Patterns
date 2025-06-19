public class RegularPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
