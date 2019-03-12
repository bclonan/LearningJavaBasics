package com.bradclonan;

public class Main {

    public static void main(String[] args) {
        /*Data Types that deal with whole numbers*/
        //Int Data Type
        //has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        //Byte Data Type
        //has a width of 8
        byte myByteValue = 10;
        byte minByteValue = -128;
        //Short Data Type
        // has a width of 16
        short myShortValue = -13728;
        short maxShortValue = 13728;

        //Long Data Type
        //has a width of 64
        //Max number is 2 to the power of 63
        long myLongValue = 100L;

        /*Arithmetic in java*/
        int myTotal = (myMinValue/2);
        //"Casting" To tell java to treat equation as byte not convert to int
        byte myNewByteValue = (byte) (myByteValue/2);
        //"Casting" To tell java to treat equation as short not convert to int
        short myNewShortValue = (short) (myShortValue/2);

    }
}
