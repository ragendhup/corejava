package com.tns.fooddeliverysystem.entities;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private int id;
    private String name;
    private List<FoodItem> menu;
    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
        this.menu = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
    }
    public void removeFoodItem(int foodItemId) {
        menu.removeIf(item -> item.getId() == foodItemId);
    }

    public List<FoodItem> getMenu() {
        return menu;
    }
    @Override
    public String toString() {
        return "Restaurant{id=" + id + ", name='" + name + "', menu=" + menu + "}";
    }
}
