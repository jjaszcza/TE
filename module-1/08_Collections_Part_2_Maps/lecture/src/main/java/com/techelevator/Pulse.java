package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Pulse {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("mike");
        names.add("mitch");
        names.add("juno");

        for (String name : names) {
            names.remove(name); //with foreach loop you cannot modify as you are iterating through the loop.
            System.out.println(name);
        }
    }
}
