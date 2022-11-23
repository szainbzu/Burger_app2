package edu.cs.birzeit.burgerapp2.model;

import java.util.List;

public interface IItemsData {
    public List<String> getCategories();
    public List<FoodItem> getItemsByCat(String cat);
}
