public class CampusFoodOrderService {
    public void placeOrder(String studentName, String foodName, String notificationType) {

        AppConfig config = AppConfig.getInstance();

        System.out.println("Order created for: " + studentName);
        System.out.println("Food item: " + foodName);
        System.out.println("Delivery Fee: " + config.getDeliveryFee() + " TL");


        Notification notification = NotificationFactory.createNotification(notificationType);

        if (notification != null) {
            notification.send(studentName, foodName);
        } else {
            System.out.println("Unknown notification type requested.");
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        CampusFoodOrderService service = new CampusFoodOrderService();


        service.placeOrder("Ali", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Zeynep", "Vegetarian Pizza", "SMS");
        service.placeOrder("Omar", "Coffee", "PUSH");
    }
}
