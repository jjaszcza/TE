package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class for testing
public class MovieRental {


//constants:
    final double VHS_PRICE = 0.99;
    final double DVD_PRICE = 1.99;
    final double BlueRay_PRICE = 2.99;
    final double premium_PRICE = 1.00;

    public static void main(String[] args) throws FileNotFoundException {
        final File movieFile = new File("C:\\Users\\Student\\workspace\\julian-jaszczak-student-code\\module-1\\Assessments\\week-5\\MovieInput.csv");
       double totalRentalPrice = 0;
        try (Scanner fileReader = new Scanner(movieFile)) {
            while (fileReader.hasNextLine()) {

                String lineOfText = fileReader.nextLine();

                String[] line = lineOfText.split(",");

                String title = line[0];
                String format = line[1];
                boolean isPremiumMovie =Boolean.parseBoolean(line[2]);


                MovieRental movieRental = new MovieRental(title, format, isPremiumMovie);
                totalRentalPrice += movieRental.getRentalPrice();



            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + movieFile.getAbsolutePath());
        }
        System.out.println(totalRentalPrice);

    }

    //instance variables
    private String title;
    private String format;
    private boolean isPremiumMovie;
    private double rentalPrice;

    //constructor class
    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
        this.rentalPrice = calculateRentalPrice();
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    //method to determine rental price based on if VHS, DVD or BluRay
//use getRentalPrice or line[3]??
    private double calculateRentalPrice() {
        double price = 0;
        if (format == "VHS") {
            price += VHS_PRICE;
        }else if (format == "DVD") {
            price += DVD_PRICE;
        }else {
            price += BlueRay_PRICE;
        } if (isPremiumMovie) {
           price += premium_PRICE;
        }
        return price;
    }


    //method to calculate late fee
    public String lateFeeCalculator(int daysLate) {
        if (daysLate == 0) {
            return "$0.00";
        } else if (daysLate == 1) {
            return "$1.99";
        } else if (daysLate == 2) {
            return "$3.99";
        } else {
            return "$19.99";
        }
    }

    //toString override
    @Override
    public String toString() {
        return "MOVIE - " +  getTitle() + " - " + getFormat() + " - " + getRentalPrice();
    }

}
