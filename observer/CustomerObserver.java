package observer;

public class CustomerObserver implements Observer {
    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String orderId) {
        System.out.println("Notification for " + name + ": Your order " + orderId + " has been completed.");
    }
}
