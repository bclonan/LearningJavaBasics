package com.bradclonan;

public class Main {

    public static void main(String[] args) {
	//Switch Statement
        int value = 1;
        //If Example
        if(value == 1){
            System.out.println("if : Value was 1");
        } else if(value == 2){
            System.out.println("if :Value was 2");
        } else {
            System.out.println("if :Was not 1 or 2");
        }
        //Above if statement converted to switch
        //TIP : Switch cases can be combined.
        //Note : Switch statements continue on until they reach a break; statement
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("switch : Value was 1");
                break;

            case 2:
                System.out.println("switch : Value was 2");
                break;

            //Shortcut in switch statements
            case 3: case 4: case 5:
                System.out.println("switch : Value was a 3, or 4, or 5");
                System.out.println("switch : The actual number was a " + switchValue);
                break;
            //End of switch statement
            default:
                System.out.println("switch : Value was not 1 or 2");
                break;
        }

        //switch statements are case sensitive so you can do something like this for month strings
        String month = "janUaRy";
        //convert month string to lower case
        switch(month.toLowerCase()) {
            case "january" :
                System.out.println("Jan");
                break;

            case "june" :
                System.out.println("Jun");
                break;

            default:
                System.out.println("Another month" + month);
                break;
        }
    }
}
