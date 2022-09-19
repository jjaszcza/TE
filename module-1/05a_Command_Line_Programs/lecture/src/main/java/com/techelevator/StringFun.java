package com.techelevator;

public class StringFun {
    public static void main(String[] args) {


        String hello = "hello";
        String world = "world";
        String full = hello + " " + world;
        String actual = "Hello World";

        System.out.println(full);
        System.out.println(actual);
        System.out.println(full == actual);
        System.out.println(actual.equals(full));
        System.out.println(actual.equalsIgnoreCase(full));

        String allOfIt  = "one two three four";
        String[] parts = allOfIt.split( " , ");
        System.out.println(allOfIt);
        for (int i=0; i< parts.length; i++) {
            System.out.println(parts[i]);
        }

        int myInt = Integer.parseInt( "42");
        long myLong = Long.parseLong( "42");
        double myDouble = Double.parseDouble( "42.9999");
        float myFloat = Float.parseFloat( "42.9887");
       // boolean myBoolean = Boolean.parseBoolean( "false");
    }
}
