package com.oopsScenarioBased.petpal;

class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp ");
    }
}
