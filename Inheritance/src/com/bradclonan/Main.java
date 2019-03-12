package com.bradclonan;

public class Main {

    public static void main(String[] args) {

        //Create animal
        Animal animal = new Animal("Unknown Animal", 1, 1,5,5);

        //Create Dog
        Dog dog = new Dog("Bulldog", 8,65,2,4,1,20,"Short Coat");
        //Call methods defined in Animal.java for all animals
        dog.eat();
        //dog.walk();
        dog.run();

        //Create Fish
        Fish fish = new Fish("Nemo", 1,1,2,2,2);
        //fish move
        fish.move(3);
    }
}
