
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {

    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart contains:");
            for (Product item : items) {
                System.out.println(item.getName() + " - Tk" + item.getPrice());
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class ECommerceOrderSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        Product laptop = new Product("Laptop", 999.99);
        Product headphones = new Product("Headphones", 49.99);
        Product phone = new Product("Phone", 599.99);

        System.out.println("Welcome to the E-Commerce Order System!");

        while (true) {
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Place Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    System.out.println("1. Laptop - Tk 999.99");
                    System.out.println("2. Headphones - Tk 49.99");
                    System.out.println("3. Phone - Tk 599.99");
                    System.out.print("Enter product number to add to cart: ");
                    int productChoice = scanner.nextInt();
                    switch (productChoice) {
                        case 1:
                            cart.addItem(laptop);
                            break;
                        case 2:
                            cart.addItem(headphones);
                            break;
                        case 3:
                            cart.addItem(phone);
                            break;
                        default:
                            System.out.println("Invalid product number.");
                    }
                    break;
                case 2:
                    cart.viewCart();
                    System.out.println("Total: $" + cart.getTotal());
                    break;
                case 3:
                    if (cart.getTotal() > 0) {
                        System.out.println("Order placed successfully. Total amount: $" + cart.getTotal());
                        cart = new ShoppingCart(); // Reset the cart after placing the order
                    } else {
                        System.out.println("Your cart is empty. Please add items before placing an order.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the E-Commerce Order System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
