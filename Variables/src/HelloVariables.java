public class HelloVariables {

    /*
    Primitives in java
    -------------------
    byte (number, 1 byte)
    short (number, 2 bytes)
    int (number, 4 bytes)
    long (number, 8 bytes)
    float (float number, 4 bytes)
    double (float number, 8 bytes)
    char (a character, 2 bytes)
    */


    public static void main(String[] args) {


        int myFirstNumber = 5;
        int myFirstAddition = 5 + 1;
        int myFirstEquation = (5 + 1) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myFirstNumber);
        System.out.println(myFirstAddition);
        System.out.println(myFirstEquation);
        System.out.println("Total " + myTotal);
    }

}


