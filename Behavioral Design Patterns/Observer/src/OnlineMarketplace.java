import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMarketplace {

    private Map<EventType,List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;
    private List<Job> jobs;

    public OnlineMarketplace() {
        this.subscribers = new HashMap<>();
        initSubscriberEvent();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
        this.jobs = new ArrayList<>();
    }

    private void initSubscriberEvent() {
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.NEW_JOB, new ArrayList<>());
    }

    public void subscribe(EventType eventType ,Subscriber subscriber) {
        this.subscribers.get(eventType).add(subscriber);
    }

    public void addProduct(Product product) {
        this.products.add(product);
        notifySubscribers(EventType.NEW_PRODUCT,"New product added " + product.getName());
    }

    public void addJob(Job job) {
        this.jobs.add(job);
        notifySubscribers(EventType.NEW_JOB, "New Job added..." + job.getJobTitle());
    }

    public void notifySubscribers(EventType eventType ,String message) {
       subscribers.get(eventType).forEach(subscriber -> subscriber.notify(message));
    }


    public void addOffer(Offer offer) {
        this.offers.add(offer);
        notifySubscribers(EventType.NEW_OFFER,"New offer :" + offer.getMessage());
    }


    public void unSubscribe(EventType eventType ,Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

}
