package utilities;

import java.util.Random;

public class DataGenerator {

    public static String generate9DigitNumber() {
        Random random = new Random();
        StringBuilder number = new StringBuilder();

        // The first digit cannot be zero
        number.append(random.nextInt(9) + 1);

        // Generate the next 8 digits
        for (int i = 0; i < 8; i++) {
            number.append(random.nextInt(10)); // Generates numbers from 0 to 9
        }

        return number.toString();
    }
}