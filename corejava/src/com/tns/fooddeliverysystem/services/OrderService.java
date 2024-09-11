package com.tns.fooddeliverysystem.services;
import java.util.ArrayList;
import java.util.List;
import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.Order;

public class OrderService {
    private List<Order> orders;
    private int orderIdCounter;
    private List<DeliveryPerson> deliveryPersons;

    public OrderService() {
        orders = new ArrayList<>();
        orderIdCounter = 1;
        deliveryPersons = new ArrayList<>();
    }

    public void placeOrder(Customer customer) {
        if (customer != null) {
            Order order = new Order(orderIdCounter++, customer);
            orders.add(order);
            System.out.println("Order placed successfully! Your order ID is: " + order.getOrderId());
        } else {
            System.out.println("Customer not found.");
        }
    }

    public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void addDeliveryPerson(int id, String name, long contactNo) {
        deliveryPersons.add(new DeliveryPerson(id, name, contactNo));
        System.out.println("Delivery person added successfully!");
    }

    public DeliveryPerson findDeliveryPersonById(int id) {
        for (DeliveryPerson deliveryPerson : deliveryPersons) {
            if (deliveryPerson.getDeliveryPersonId() == id) {
                return deliveryPerson;
            }
        }
        return null;
    }

    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
        Order order = findOrderById(orderId);
        if (order != null) {
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
}
