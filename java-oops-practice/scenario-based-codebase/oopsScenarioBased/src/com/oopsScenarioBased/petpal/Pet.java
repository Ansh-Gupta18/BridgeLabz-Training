package com.oopsScenarioBased.petpal;

import java.util.Random;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private int mood;     // 0 = sad, 100 = happy

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(50) + 30;
        this.energy = rand.nextInt(50) + 30;
        this.mood = rand.nextInt(50) + 30;
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Encapsulated behavior
    public void feed() {
        hunger -= 20;
        mood += 10;
        if (hunger < 0) hunger = 0;
        System.out.println(name + " is eating ");
    }

    public void play() {
        energy -= 15;
        hunger += 10;
        mood += 20;
        System.out.println(name + " is playing ");
    }

    public void sleep() {
        energy += 30;
        hunger += 5;
        System.out.println(name + " is sleeping ");
    }

    // Protected method to view internal status
    protected void showStatus() {
        System.out.println("Hunger: " + hunger + " | Energy: " + energy + " | Mood: " + mood);
    }

    // Polymorphic method
    public abstract void makeSound();
}

