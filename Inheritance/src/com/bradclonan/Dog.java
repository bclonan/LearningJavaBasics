package com.bradclonan;

//Can assign extra fields unique to dog
//To inherit from a class you use the extend keyword
//Can call, ovveride methods from super class
public class Dog extends Animal {

    //Dog class Unique fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Initialize the base animal class
    //"super" keyword means to call the constructor extending from super class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //Dog Specific method
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //TIP : can override methods from super class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    //More method examples
    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
