public class JobFinder implements Subscriber{
    private String name;

    public JobFinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name + "  notifying about new job apply here: " + message);
    }
}
