import notification.Notification;
import notification.NotificationFactory;
import observer.CustomerObserver;
import observer.Order;
import singleton.OrderManager;
import strategy.CreditCardPayment;
import strategy.PaymentContext;
import strategy.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        OrderManager orderManager = OrderManager.getInstance();
        orderManager.processOrder("12345");

        // Factory Pattern
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();

        // Observer Pattern
        Order order = new Order("12345");
        CustomerObserver customer = new CustomerObserver("Caua");
        order.addObserver(customer);
        order.completeOrder();

        // Strategy Pattern
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PaypalPayment("caua862979@gmail.com"));
        paymentContext.pay(200);
    }
}
