
package com.tns.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<FoodItem, Integer> items = new HashMap<>();

    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, quantity);
    }

    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder cartString = new StringBuilder();
        double totalCost = 0;
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            cartString.append(entry.getKey().getName())
                      .append(", Quantity: ").append(entry.getValue())
                      .append(", Cost: Rs. ").append(entry.getKey().getPrice() * entry.getValue())
                      .append("\n");
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }
        cartString.append("Total Cost: Rs. ").append(totalCost);
        return cartString.toString();
    }
}
