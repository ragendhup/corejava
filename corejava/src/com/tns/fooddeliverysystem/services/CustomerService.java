
package com.tns.fooddeliverysystem.services;
//Program to define CustomerService class package com.tns.fooddeliverysystem.services;
import java.util.ArrayList;
import java.util.List;
import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.FoodItem;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
    }

    public void addCustomer(int userId, String username, long contactNo) {
        customers.add(new Customer(userId, username, contactNo));
        System.out.println("Customer created successfully!");
    }

    public Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getUserId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public void viewCart(Customer customer) {
        if (customer != null) {
            System.out.println("Cart:");
            System.out.println(customer.getCart());
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void addFoodToCart(Customer customer, FoodItem foodItem, int quantity) {
        if (customer != null && foodItem != null) {
            customer.getCart().addItem(foodItem, quantity);
            System.out.println("Food item added to cart!");
        } else {
            System.out.println("Customer or Food item not found.");
        }
    }
}
