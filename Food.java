package com.mealtracker;

import java.util.ArrayList;

class Food {
    //provate means that this can be accessed by other methods within this class, but nothing outside of it
    //So ALL fields w/i a class are private, even if the class is public
    //If it's public, someone can go into your code and change it.
    //Types: String, Char, Enum, Category, (byte, long, int, double)

    //Fields
    //It's colloquial to name the fields with a letter in front, often m
    private final String mName;
    private final Category mCategory;
    private final double mCalories;
    private final double mCarbohydrates;
    private final double mFat;
    private final double mProtein;

    private final ArrayList<Category> mCategories = new ArrayList<>();

    Food(String name, double carbs, double fat, double protein, Category category) {
        this.mName = name;
        this.mCategory = category;

        this.mCarbohydrates = carbs;
        this.mFat = fat;
        this.mProtein = protein;

        this.mCalories = calculateCalories(carbs, fat, protein);
    }

    //===================//
    // Food Calculations //
    //===================//

    private static double calculateCalories(double carbs, double fat, double protein) {
        if (this.mCategory === "IceCream") {
            return 0;
            console.log("Ice Cream has no calories!")
        } else {
            return 9 * fat + 4 * carbs + 4 * protein;
        }
    }

    //Returning values of the class's current state
    double getCalories() {
        return this.mCalories;
    }

    double getCarbohydrates() {
        return this.mCarbohydrates;
    }

    Category getCategory() {
        return this.mCategory;
    }

    double getFat() {
        return this.mFat;
    }

    double getProtein() {
        return this.mProtein;
    }

    String getName() {
        return this.mName;
    }

    //It is pushing to an ArrayList rather than being created
    //Void has no return value and was defined elsewhere
    void addCategory(Category category) {
        this.mCategories.add(category);
    }
}