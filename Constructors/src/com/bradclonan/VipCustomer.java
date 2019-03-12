package com.bradclonan;

public class VipCustomer {

    private String name;
    private Double creditLimit;
    private String email;

    //Default constructor
    public VipCustomer() {
        this.name = "New Customer";
        this.creditLimit = 1000.00;
        this.email = "default@mybank.com";
    }

    //Call constructor
    public VipCustomer(String name, Double creditLimit) {
        this(name, creditLimit, "unknown");
    }


    //Save all fields
    public VipCustomer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
