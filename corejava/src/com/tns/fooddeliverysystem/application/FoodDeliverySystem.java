
package com.tns.fooddeliverysystem.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Order;
import com.tns.fooddeliverysystem.entities.Restaurant;

public class FoodDeliverySystem {
    private static List<Restaurant> restaurants = new ArrayList<>();
    private static List<DeliveryPerson> deliveryPersons = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();
    private static int orderIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    adminMenu(scanner);
                    break;
                case 2:
                    customerMenu(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void adminMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addRestaurant(scanner);
                    break;
                case 2:
                    addFoodItemToRestaurant(scanner);
                    break;
                case 3:
                    removeFoodItemFromRestaurant(scanner);
                    break;
                case 4:
                    viewRestaurantsAndMenus();
                    break;
                case 5:
                    viewOrders();
                    break;
                case 6:
                    addDeliveryPerson(scanner);
                    break;
                case 7:
                    assignDeliveryPersonToOrder(scanner);
                    break;
                case 8:
                    System.out.println("Exiting Admin Module");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 8);
    }

    private static void customerMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    viewFoodItems();
                    break;
                case 3:
                    addFoodToCart(scanner);
                    break;
                case 4:
                    viewCart(scanner);
                    break;
                case 5:
                    placeOrder(scanner);
                    break;
                case 6:
                    viewCustomerOrders(scanner);
                    break;
                case 7:
                    System.out.println("Exiting Customer Module");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 7);
    }

    private static void addRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Restaurant Name: ");
        String name = scanner.nextLine();
        restaurants.add(new Restaurant(id, name));
        System.out.println("Restaurant added successfully!");
    }

    private static void addFoodItemToRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        Restaurant restaurant = findRestaurantById(restaurantId);
        if (restaurant != null) {
            System.out.print("Enter Food Item ID: ");
            int foodItemId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Food Item Name: ");
            String foodItemName = scanner.nextLine();
            System.out.print("Enter Food Item Price: ");
            double price = scanner.nextDouble();
            restaurant.addFoodItem(new FoodItem(foodItemId, foodItemName, price));
            System.out.println("Food item added successfully!");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static void removeFoodItemFromRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        Restaurant restaurant = findRestaurantById(restaurantId);
        if (restaurant != null) {
            System.out.print("Enter Food Item ID: ");
            int foodItemId = scanner.nextInt();
            restaurant.removeFoodItem(foodItemId);
            System.out.println("Food item removed successfully!");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static void viewRestaurantsAndMenus() {
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            for (FoodItem foodItem : restaurant.getMenu()) {
                System.out.println("- Food Item ID: " + foodItem.getId() + ", Name: " + foodItem.getName() + ", Price: Rs. " + foodItem.getPrice());
            }
        }
    }

    private static void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private static void addDeliveryPerson(Scanner scanner) {
        System.out.print("Enter Delivery Person ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Delivery Person Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();
        deliveryPersons.add(new DeliveryPerson(id, name, contactNo));
        System.out.println("Delivery person added successfully!");
    }

    private static void assignDeliveryPersonToOrder(Scanner scanner) {
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        Order order = findOrderById(orderId);
        if (order != null) {
            System.out.print("Enter Delivery Person ID: ");
            int deliveryPersonId = scanner.nextInt();
            DeliveryPerson deliveryPerson = findDeliveryPersonById(deliveryPersonId);
            if (deliveryPerson != null) {
                order.setDeliveryPerson(deliveryPerson);
                System.out.println("Delivery person assigned to order successfully!");
            } else {
                System.out.println("Delivery person not found.");
            }
        } else {
            System.out.println("Order not found.");
        }
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();
        customers.add(new Customer(userId, username, contactNo));
        System.out.println("Customer created successfully!");
    }

    private static void viewFoodItems() {
        viewRestaurantsAndMenus();
    }

    private static void addFoodToCart(Scanner scanner) {
        System.out.print("Enter Customer/User ID: ");
        int userId = scanner.nextInt();  // Same as customerId
        Customer customer = findCustomerById(userId);
        if (customer != null) {
            System.out.print("Enter Restaurant ID: ");
            int restaurantId = scanner.nextInt();
            Restaurant restaurant = findRestaurantById(restaurantId);
            if (restaurant != null) {
                System.out.print("Enter Food Item ID: ");
                int foodItemId = scanner.nextInt();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                FoodItem foodItem = findFoodItemById(restaurant, foodItemId);
                if (foodItem != null) {
                    customer.getCart().addItem(foodItem, quantity);
                    System.out.println("Food item added to cart!");
                } else {
                    System.out.println("Food item not found.");
                }
            } else {
                System.out.println("Restaurant not found.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void viewCart(Scanner scanner) {
        System.out.print("Enter Customer/User ID: ");
        int userId = scanner.nextInt();  // Same as customerId
        Customer customer = findCustomerById(userId);
        if (customer != null) {
            System.out.println("Cart:");
            System.out.println(customer.getCart());
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void placeOrder(Scanner scanner) {
        System.out.print("Enter Customer/User ID: ");
        int userId = scanner.nextInt();  // Same as customerId
        Customer customer = findCustomerById(userId);
        if (customer != null) {
            orders.add(new Order(orderIdCounter++, customer));
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void viewCustomerOrders(Scanner scanner) {
        System.out.print("Enter Customer/User ID: ");
        int userId = scanner.nextInt();  // Same as customerId
        Customer customer = findCustomerById(userId);
        if (customer != null) {
            for (Order order : orders) {
                if (order.getCustomer().equals(customer)) {
                    System.out.println(order);
                }
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static Restaurant findRestaurantById(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    private static Order findOrderById(int id) {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        return null;
    }

    private static DeliveryPerson findDeliveryPersonById(int id) {
        for (DeliveryPerson deliveryPerson : deliveryPersons) {
            if (deliveryPerson.getDeliveryPersonId() == id) {
                return deliveryPerson;
            }
        }
        return null;
    }

    private static Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getUserId() == id) {
                return customer;
            }
        }
        return null;
    }

    private static FoodItem findFoodItemById(Restaurant restaurant, int id) {
        for (FoodItem foodItem : restaurant.getMenu()) {
            if (foodItem.getId() == id) {
                return foodItem;
            }
        }
        return null;
    }
}
