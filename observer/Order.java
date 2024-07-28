package observer;

public class Order extends Subject {
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void completeOrder() {
        System.out.println("Order " + orderId + " is completed.");
        notifyObservers(orderId);
    }
}
