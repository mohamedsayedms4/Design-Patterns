public class Flyer extends MarketingMaterial{

    public Flyer(String layout, String color, String content) {
        super(layout, color, content);
    }

    @Override
    public String toString() {
        return "Flyer{" +
                "layout='" + super.getLayout() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", content='" + super.getContent() + '\'' +
                '}';
    }

    @Override
    public Flyer clone() {
        return new Flyer(this.getLayout(), this.getContent(), this.getColor());
    }


}
