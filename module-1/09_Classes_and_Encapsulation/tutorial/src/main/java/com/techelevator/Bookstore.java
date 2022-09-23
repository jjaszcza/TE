package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        // Step Three: Test the getters and setters
    Book twoCities = new Book();
    twoCities.setTitle("A Tale of Two Cities");
    twoCities.setAuthor("Charles Dickens");
    twoCities.setPrice(14.99);
        System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: $" + twoCities.getPrice());

        // Step Five: Test the Book constructor
        Book threeMusketeers = new Book("The Three Musketeers", "Alexandere Dumas", 12.95);

        Book childhoodEnd = new Book("Childhood's End", "Arthur C. Clark", 5.99);

        System.out.println("Title: " + threeMusketeers.getTitle() + ", Author: " + threeMusketeers.getAuthor() + ", Price: $" + threeMusketeers.getPrice());
        System.out.println("Title: " + childhoodEnd.getTitle() + ", Author: " + childhoodEnd.getAuthor() + ", Price: $" + childhoodEnd.getPrice());


        // Step Nine: Test the ShoppingCart class
        
    }
}
