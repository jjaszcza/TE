package com.techelevator;



public class Pulse {
    public static void main(String[] args) {

        String str = "abcdefg"; //use a for loop, iterate across string, print everything forward
        for (int index =0; index < str.length(); index++) {
            String rest = str.substring(index);
            System.out.println(rest);
        }


    }
}
