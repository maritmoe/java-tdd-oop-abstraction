package com.booleanuk.core;

import java.util.HashMap;
import java.util.Random;

// Example from morning activity
public class PlayerCharacter {
    // No variables should be public.
    private HashMap<String, String> nameAndTitle;
    private int health;

    public PlayerCharacter(String name, String title) {

        this.nameAndTitle = new HashMap<>();
        this.nameAndTitle.put("name", name);
        this.nameAndTitle.put("title", title);

        this.health = this.getDiceRoll(1,101);
    }

    //  For the user using getName() the method returns the same value with the structure of a hashMap
    // as the structure with name and title as separate String variables.
    public String getName() {
        return this.nameAndTitle.get("name");
    }

    public String getTitle() {
        return this.nameAndTitle.get("title");
    }

    public int getHealth() {
        return this.health;
    }

    public void boostHealth() {
        this.health += 10;
    }

    // Methods can also be private
    private int getDiceRoll(int lower, int upperBound) {
        Random randomiser = new Random();
        return randomiser.nextInt(lower, upperBound);
    }


    // Abstraction: how thing works is hidden to the user, user only access to public info.
    // Goal: Hide away the logic, make the public interface easier.

    // The tests should test the public interface.
}
