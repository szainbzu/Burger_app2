package edu.cs.birzeit.burgerapp2.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements IItemsData{
    private List<FoodItem> items;

    public ItemsData(){
        items = new ArrayList<>();
        items.add(new FoodItem("Classic Burger", "Burgers", 30));
        items.add(new FoodItem("Cheese Burger", "Burgers", 30));
        items.add(new FoodItem("Double Burger", "Burgers", 30));
        items.add(new FoodItem("Mushrom Burger", "Burgers", 30));
        items.add(new FoodItem("Chicken Burger", "Burgers", 30));
        items.add(new FoodItem("BBQ Burger", "Burgers", 30));
        items.add(new FoodItem("Double BBQ Burger", "Burgers", 30));
        items.add(new FoodItem("Crispy Burger", "Burgers", 30));
        items.add(new FoodItem("Cheese Crispy Burger", "Burgers", 30));
        items.add(new FoodItem("Diet Cola", "Drinks", 5));

    }
    @Override
    public List<String> getCategories() {
       List<String> cats = new ArrayList<>();
       cats.add("Burgers");
       cats.add("Drinks");
       cats.add("Hot Drinks");
       return cats;
    }

    @Override
    public List<FoodItem> getItemsByCat(String cat) {
        List<FoodItem> result = new ArrayList<>();

        for(FoodItem it : items){
            if(it.getCat().equals(cat)){
                result.add(it);
            }
        }
        return result;
    }
}
