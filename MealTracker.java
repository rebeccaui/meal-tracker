package com.mealtracker;

import java.util.ArrayList;

class MealTracker {

    //Creates an Array List of Meals to observe trends
    private final ArrayList<Meal> mMeals = new ArrayList<>();
    private final User mUser;

    //A MealTracker constructor that is built for the individual user
    //has a state of the user's name
    MealTracker(User user) {
        this.mUser = user;
    }

    //Every meal in the current state of the mMeals ArrayList,
    //gets constructed as a Meal
    void addMeal(Meal meal) {
        this.mMeals.add(meal);
    }


    //==========================//
    // MealTracker Calculations //
    //==========================//

    // If the current state of the user's adherence is
    // >= the target adherence, then the user "is on track" 
    boolean isOnTrack() {
        return this.getAdherence() >= this.mUser.getTargetAdherence();
    }

    //A function that calculates the user's adherence 
    //to the "complete meal" schedule. Returns a double value.
    double getAdherence() {
        //count starts starts at 0 since the zero has not eaten anything
        int count = 0;

        //A for loop that goes through the current state of the mMeals ArrayList
        //and constructs each meal in the ArrayList as a Meal,
        for (Meal meal : this.mMeals) {
            //and if the meal was complete, increment the count
            if (meal.isComplete()) {
                count += 1;
            }
        }
        //Return: the count value divided by 
        //the number of meals in the mMeals ArrayList times 100
        return count / this.mMeals.size() * 100;
    }
    //A function to get the number of meals in the mMeals array
    int getMealCount() {
        return this.mMeals.size();
    }
    //A for loop that goes through the current state of the mMeals ArrayList
    //and constructs each meal in the ArrayList as a Meal.
    //It prints the name of each meal in the mMeals ArrayList
    void viewMeals() {
        for (Meal meal : this.mMeals) {
            System.out.println(meal.getName());
        }
    }
}
