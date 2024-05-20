package resturant;

public class Main {

    public static void main(String[] args) {

   Resturant restaurant = new Resturant();

        // Adding menu items
        restaurant.addMenuItem("Burger", "A delicious burger", 599);
        restaurant.addMenuItem("Pizza", "Tasty pizza with toppings", 899);
        restaurant.addMenuItem("Salad", "Fresh garden salad", 399);
        restaurant.addMenuItem("Kacci", "Original  Kacci Bhabi", 499);

        // Creating an order
        Order order = restaurant.createOrder();
        order.addItem(restaurant.getMenuItem("Burger"));
        order.addItem(restaurant.getMenuItem("Pizza"));
        order.addItem(restaurant.getMenuItem("Salad"));

        // Calculating total
        double total = order.getTotal();
        System.out.println("Total: Tk " + total);
    }
}