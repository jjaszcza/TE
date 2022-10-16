package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class for testing
public class MovieRental {
    public static void main(String[] args) throws FileNotFoundException {
        MovieRental m = new MovieRental("title", "format", true);
    }

//instance variables
    private String title;
    private String format;
    private boolean isPremiumMovie;
    private int rentalPrice;
//constructor class
    public MovieRental(String title, String format, boolean isPremiumMovie) throws FileNotFoundException {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
    }
//getters
    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

//method to determine rental price based on if VHS, DVD or BluRay
//use getRentalPrice or line[3]??

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
        return "MOVIE" + getTitle() + getFormat() + getRentalPrice();
    }
//list to populate from file
    List<MovieRental> movies = new ArrayList<>();

//file object, scanner to read and split file,
    final File movieFile = new File("C:\\Users\\Student\\workspace\\julian-jaszczak-student-code\\module-1\\Assessments\\week-5\\MovieInput.csv");

       try(Scanner fileReader = new Scanner(movieFile)) {
        while (fileReader.hasNextLine()) {

            String lineOfText = fileReader.nextLine();

            String[] line = lineOfText.split(",");

            String title = line[0];
            String format = line[1];
            String isPremiumMovie = line[2];
            String rentalPrice = line[3];

            final StringBuilder sb = new StringBuilder(lineOfText);
            System.out.println(sb.reverse().toString());
        }
    } catch(FileNotFoundException e)

    {
        System.out.println("file not found " + movieFile.getAbsolutePath());
    }

}
}
