package com.avaya;

public class DataTypes {

    // declare properties of this class
    Byte myByte;
    int bigInteger = 123_456_789; // convenient way to make numbers legible
    Long myLongNumber = 453_432_567_676_345L; // the L says is a Long

    public static void main(String[] arguments){
        DataTypes myDT = new DataTypes();
    }

    public DataTypes() {
        myByte = 127 ; // Byte can be -128 to +127
       // myByte;
        bigInteger = (int) ++myByte; // this is typecasting
        System.out.println( myByte.getClass() ); // println will type-cast if needed

        if("Hello" instanceof String){
            System.out.println("it is a String data type");
        }


    }
}
