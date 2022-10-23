

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.MovieRental;


public class MovieRentalTest {

    @Test

    public void rental_price_calculation() {

        //arrange
        MovieRental movieRental = new MovieRental("The Room", "VHS", false);
        //act
        double actual = movieRental.getRentalPrice();
        //assert
        Assert.assertEquals(actual, 0.99, "non-premium VHS is 0.99");

    }

    @Test
    public void late_fee_calculation() {

        //arrange
        MovieRental movieRental = new MovieRental("The Room", "VHS", false);

        //act
        String actual = movieRental.lateFeeCalculator(2);
        //assert
        Assert.assertEquals(actual, "$3.99", "the fee is $3.99");
    }

}
