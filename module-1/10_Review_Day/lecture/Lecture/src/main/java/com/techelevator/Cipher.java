package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Cipher {
    public static void main(String[] args) {
        Cipher c = new Cipher();
        System.out.println(c.encrypt("HELLO"));
    }

    public String encrypt (String source) {

        String result = "";
        Map<Character, Character> lookUp = new HashMap<Character, Character>();
        lookUp.put('H', 'L');
        lookUp.put('O', 'D');
        lookUp.put('E', 'G');
        lookUp.put('L', 'R');

        //iterate source string
        for(int index = 0; index < source.length(); index++) {

            char theLetter = source.charAt(index);
            //lookup sub value
            char replacementChar = lookUp.get(theLetter);

            result+= replacementChar;
        }

    return result;

        //create new string

    }

    public String decrypt (String encrypted) {
        
    }

}
