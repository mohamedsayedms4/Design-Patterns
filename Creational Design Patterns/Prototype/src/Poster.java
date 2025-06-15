public class Poster extends MarketingMaterial{

    public Poster(String layout, String color, String content) {
        super(layout, color, content);
    }

    @Override
    public Poster clone() {
        return new Poster(this.getLayout(), this.getContent(), this.getColor());
    }
}
