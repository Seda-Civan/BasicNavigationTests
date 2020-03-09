package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){

        if(expected.equalsIgnoreCase(actual)){
            System.out.println("PASS");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }
}
