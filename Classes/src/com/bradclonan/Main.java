package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//Build object based on car class
        //Java see's Car as a data type because we have created the class
        // porsche is a type of car
        //Initialize object
        //Note must use the new keyword
        Car porsche = new Car();
        //Initialize another object
        Car dodge = new Car();

        //Access method in Car Class
        porsche.setModel("Carrera");
        dodge.setModel("viper");
        //Access getModel Getter in Car Class
        System.out.println("The model of the car is " + porsche.getModel());

        System.out.println("The model of the car is " + dodge.getModel());
    }
}
