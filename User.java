package com.mealtracker;

class User {

    //all field variables that stay final(constant) in value
    public final String mFirstName;
    public final String mLastName;
    public final String mEmail;
    public final double mTargetAdherence;

    //A User Constructor 
    //defines its fields and
    //sets the initial state of the User
    User(String firstName, String lastName, String email, double target) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mEmail = email;
        this.mTargetAdherence = target;
    }

    //Functions to return the data 
    String getFirstName() {
        return this.mFirstName;
    }

    String getLastName() {
        return this.mLastName;
    }

    String getEmail() {
        return this.mEmail;
    }

    double getTargetAdherence() {
        return this.mTargetAdherence;
    }

}