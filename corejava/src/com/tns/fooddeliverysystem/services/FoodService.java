
package com.tns.fooddeliverysystem.services;
import java.util.ArrayList;
import java.util.List;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Restaurant;

public class FoodService {
    private List<Restaurant> restaurants;

    public FoodService() {
        restaurants = new ArrayList<>();
    }

    public void addRestaurant(int id, String name) {
        restaurants.add(new Restaurant(id, name));
        System.out.println("Restaurant added successfully!");
    }

    public void addFoodItemToRestaurant(int restaurantId, int foodItemId, String foodItemName, double price) {
        Restaurant restaurant = findRestaurantById(restaurantId);
        if (restaurant != null) {
            restaurant.addFoodItem(new FoodItem(foodItemId, foodItemName, price));
            System.out.println("Food item added successfully!");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        Restaurant restaurant = findRestaurantById(restaurantId);
        if (restaurant != null) {
            restaurant.removeFoodItem(foodItemId);
            System.out.println("Food item removed successfully!");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    public void viewRestaurantsAndMenus() {
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            for (FoodItem foodItem : restaurant.getMenu()) {
                System.out.println("- Food Item ID: " + foodItem.getId() + ", Name: " + foodItem.getName() + ", Price: Rs. " + foodItem.getPrice());
            }
        }
    }

    public Restaurant findRestaurantById(int id) {
        for (Restaurant restaurant : restaurants) {
            if (((FoodItem) restaurants).getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    public FoodItem findFoodItemById(Restaurant restaurant, int id) {
        for (FoodItem foodItem : restaurant.getMenu()) {
            if (foodItem.getId() == id) {
                return foodItem;
            }
        }
        return null;
    }
}

