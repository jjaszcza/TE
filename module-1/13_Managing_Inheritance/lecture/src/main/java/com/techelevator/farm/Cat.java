package com.techelevator.farm;

public class Cat extends FarmAnimal {
    public Cat(String name, String sound) {
        super("cat", "meow");
    }

    public Cat() {
        super();
    }

    @Override
    public String getSound() {
        if (Math.random() > 0.5) {
            return "purrrr";
        } else {
            return "meow";
        }
    }
}
