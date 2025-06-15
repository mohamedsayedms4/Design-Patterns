public class Brochure extends MarketingMaterial{

    public Brochure(String layout, String color, String content) {
        super(layout, color, content);
    }

    @Override
    public Brochure clone() {
        return new Brochure(this.getLayout(), this.getColor(), this.getContent());
    }
}
