package com.bradclonan;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    //Create method in class
    public void setModel(String model){
        String validModel = model.toLowerCase();

        //Setup rules for model i.e. only carrera or viper or return unknown
        if(validModel.equals("carrera") || validModel.equals("viper")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //Create Getters to return data
    public String getModel() {
        return this.model;
    }

}
