package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieRentalCLI {

    public static void main(String[] args) throws FileNotFoundException {
        final File movieFile = new File("C:\\Users\\Student\\workspace\\julian-jaszczak-student-code\\module-1\\Assessments\\week-5\\MovieInput.csv");
        double totalRentalPrice = 0;
        try (Scanner fileReader = new Scanner(movieFile)) {
            while (fileReader.hasNextLine()) {

                String lineOfText = fileReader.nextLine();

                String[] line = lineOfText.split(",");

                String title = line[0];
                String format = line[1];
                boolean isPremiumMovie = Boolean.parseBoolean(line[2]);


                MovieRental movieRental = new MovieRental(title, format, isPremiumMovie);
                totalRentalPrice += movieRental.getRentalPrice();


            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + movieFile.getAbsolutePath());
        }
        System.out.println(totalRentalPrice);

    }
}
