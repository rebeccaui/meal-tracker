package com.mealtracker;

import java.util.ArrayList;

class Meal {

    //ArrayList of Foods which creates a single instacne of a meal
    private final ArrayList<Food> mFoods = new ArrayList<>();
    
    private final String mName;
    //Constructs a Meal with a name field
    //the state of its mName is a name
    Meal (String name) {
        this.mName = name;
    }

    boolean isComplete() {
        boolean protein = false;
        boolean fat = false;
        boolean fruit = false;
        boolean vegetables = false;
        boolean chocolate = false;
        boolean icecream = false;

        //A switch case that goes through the mFoods in the current state of the meal,
        //constructs each one in that ArrayList as a Food,
        //and creates a true boolean if the Category of that food is present in the ArrayList.
            //This boolean is referenced in the isComplete() method
            //to see if the meal contained all required food Categories.
        for (Food food : this.mFoods) {
            switch (food.getCategory()) {
                case Protein:
                    protein = true;
                    break;
                case Fat:
                    fat = true;
                    break;
                case Carbohydrates:
                    carbohydrates = true;
                    break;
                case Fruit:
                    fruit = true;
                    break;
                case Vegetable:
                    vegetables = true;
                    break;
                case Chocolate:
                    chocolates = true;
                    break;
                case IceCream:
                    icecream = true;
                    break;
            }
        }

        return fat && protein && vegetables && fruit && chocolate && icecream;
    }

    //===================//
    // Meal Calculations //
    //===================//

    //Calculates the Calories, Fat, Carbs, and Protein values 
    //of the meal instance 
    //results in a double value.

    double getCalories() {
        //Calorie Count begins at 0, because the user hasn't eaten anything
        double calories = 0;
        //A for loop that goes through the mFoods in the current state of the meal,
        //constructs each one in that ArrayList as a Food,
        //and finds the sum of all the calories of each food item in the array
        //and sets it to calories variable
        for (Food food : this.mFoods) {
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.mFoods) {
            fat += food.getFat();
        }

        return fat;
    }

    
    double getCarbohydrates() {
        double carbohydrates = 0;

        for (Food food : this.mFoods) {
            carbohydrates += food.getCarbohydrates();
        }

        return carbohydrates;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.mFoods) {
            protein += food.getProtein();
        }

        return protein;
    }

    // Returns the name of the meal instance as a String
    String getName() {
        return this.mName;
    }

    //A for loop that goes through the mFoods in the current state of the meal,
    //constructs each one in that ArrayList as a Food,
    //and prints out the name of each of those foods.
    void viewFoods() {
        for (Food food : this.mFoods) {
            System.out.println(food.getName());
        }
    }

}
