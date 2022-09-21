package com.techelevator;

import java.util.Locale;

public class StringFun {
    public static void main(String[] args) {

        int[] a = {1,2,3,5};
        String s = "literal";
        System.out.println(s.length());
        String e = "";
        System.out.println(e.length());
        String allWhiteSpaces = "      ";
        System.out.println(allWhiteSpaces.length());

        if (e.length() == 0) {
            //do something
        }
        //substring()
        String alpha = "abcdefghijklm";
        System.out.println(alpha.substring(10));
        System.out.println(alpha.substring(0));
        System.out.println(alpha.substring(0,4)); //second number is offset by -1. 0,4 returns abcd but not e.

        //indexOf()
        System.out.println(alpha.indexOf("bc"));
        System.out.println(alpha.indexOf("not-there")); //returns -1 if the content doesn't exist in the string.

        //charAt()
        System.out.println(alpha.charAt(1));

        //contains()
        System.out.println(alpha.contains("abc"));
        System.out.println(alpha.contains("xyz"));

        String c = "a";
        String cHold = c;
        c = c + "b";
        System.out.println(c);
        System.out.println(cHold);

        System.out.println(alpha.toUpperCase()); //does not modify, creates a new string in all caps

        //replace()
        System.out.println(alpha.replace("def", "-julian-"));

        String multi = "1,2,3,4";
        String[] parts = multi.split( ",");
        String whole = String.join( "", parts);
        System.out.println(whole);

        //startsWith() & endsWith()
        String source = "abc";
        if ("ab".equals(source.substring(0,"ab".length()))) { //works, but is unnecessarily complicated
            System.out.println("yes");
        }

        if (source.startsWith("ab")) {
            System.out.println("also yes");
        }


    }

}
