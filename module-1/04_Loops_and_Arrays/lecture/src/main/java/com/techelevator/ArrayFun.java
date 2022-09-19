package com.techelevator;

public class ArrayFun {
    public static void main(String[] args) {

        int a = 13;
        int b = a;

        int[] arr = {1,1,1,1,1};
        int[] anotherArr = arr;

        b = 15;
        anotherArr[0] = 6;

        int [] grades = new int [4];
        int x = 1;
        grades [0] = 1;
        grades [1] = 2;
        grades [3] = 3;
        grades [2] = 4;

        // grades | 1 | 2 | 4 | 3 ** they don't need to be in sequential order
        if (true) {
            grades [0] = 10;
        }
        int[] grades2 = new int []{1,2,3,4};
        int[] grades3 = {1,2,3,4,9};


        System.out.println(grades3.length); //get length of array
        System.out.println(grades3[0]); //first element
        System.out.println(grades3[grades3.length-1]);

        double [] scores = new double [10];

        for(int index=0; index < grades3.length; index ++) {
            System.out.println(grades3[index]);
        }
        for(int index=grades3.length-1; index>=0 ;index--) {
            System.out.println(grades3[index]);
        }

        int result = 0;
        for(int index=0; index < grades3.length; index+=2) {
            result += grades3[index];
        }
        System.out.println(result);
    }
}
