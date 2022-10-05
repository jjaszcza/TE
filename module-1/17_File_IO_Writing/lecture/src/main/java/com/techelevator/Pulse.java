package com.techelevator;

public class Pulse {

    public int makeCard(int rank, int suit) {
        //parameter checking
        if (rank < 1 || rank > 13)  {
            throw new IllegalArgumentException("rank must be between 1 and 13");
        }
        if (suit < 1 || suit > 4) {
            throw new IllegalArgumentException("suit must be between 1 and 4");
        }
   return 0; }
}
