package com.techelevator;

public class FruitTree {

    //getters

    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    //constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit; //initialize
        this.piecesOfFruitLeft = startingPiecesOfFruit; //initialize
    }

    //instance variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
        return false;
    }


}
