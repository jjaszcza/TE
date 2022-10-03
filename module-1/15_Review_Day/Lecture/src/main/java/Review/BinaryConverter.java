package Review;

public class BinaryConverter {

    public String toBinary(int decimal) {
        int number = decimal;
        String result = "";

        do {

        number = number / 2;
        result = (number % 2) + result; //remainder

        } while (number > 0);
        return result;
    }
}
