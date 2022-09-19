package com.techelevator;

public class Loops {
    public static void main(String[] args) {

  //      int x = 0; // <== initializer
  //      while (x <= 10) { //<== condition
  //          System.out.println(x);
  //          x++; // <== iterator/ incrementing by

    //    }
     //   System.out.println("outside the x loop.");

        for (int y = 0; y <= 10; y += 1) {
            if (y == 5) {
                continue;
            }

            System.out.println(y);
        }
        System.out.println("outside the y loop.");
    }
}
