package com.bradclonan;

public class Main {

    public static void main(String[] args) {

//        BankAccount customer = new BankAccount();
//
//        //set initial customer account info using constructor
//        customer.setAccountNumber(123456789);
//        customer.setEmail("bigballer@gmail.com");
//        customer.setBalance(100.00);
//        customer.setName("Brad");
//        customer.setPhoneNumber("732-476-9555");
        //Calling initial constructor
        BankAccount customer = new BankAccount(123456789 , 0.00, "Brad Clo", "myemail@aim.com", "732-476-9555");


        //withdraw and deposit
        customer.deposit(100);
        customer.withdrawal(140);
        customer.withdrawal(55);

        //Get Customer info
        System.out.println("Account Number : " + customer.getAccountNumber());
        System.out.println("Balance : " + customer.getBalance());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Name : " + customer.getName());
        System.out.println("Phone Number : " + customer.getPhoneNumber());

        //VIP customer class
        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Brad", 25000.00);
        VipCustomer person3 = new VipCustomer("Jack", 75000.00, "jack@jackemail.com");
        //Get vip customer info
        System.out.println("Person1 Vip customer name : " + person1.getName());
        System.out.println("Person1 Vip customer limit : " + person1.getCreditLimit());
        System.out.println("Person1 Vip customer email : " + person1.getEmail());

        System.out.println("Person2 Vip customer name : " + person2.getName());
        System.out.println("Person2 Vip customer limit : " + person2.getCreditLimit());
        System.out.println("Person2 Vip customer email : " + person2.getEmail());

        System.out.println("Person3 Vip customer name : " + person3.getName());
        System.out.println("Person3 Vip customer limit : " + person3.getCreditLimit());
        System.out.println("Person3 Vip customer email : " + person3.getEmail());

    }
}
