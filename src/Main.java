import bigdecimal.BigDecimalOperations;
import car.*;
import video.*;
import list.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Test BigDecimal Operations
        BigDecimal value1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + BigDecimalOperations.roundToHundredth(value1));

        BigDecimal value2 = new BigDecimal("1.2345");
        System.out.println("Reverse sign and round to tenth: " + BigDecimalOperations.reverseSignAndRoundToTenth(value2));

        // Test Car Inventory
        Car sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 30000);
        System.out.println(sedan.getInfo());

        Car utilityVehicle = new UtilityVehicle("1C4RJFBG9EC123456", "Jeep", "Grand Cherokee", 25000, true);
        System.out.println(utilityVehicle.getInfo());

        Car truck = new Truck("1FTFW1EF8EK123456", "Ford", "F-150", 15000, 13000);
        System.out.println(truck.getInfo());

        // Test Video Streaming
        Video movie = new Movie("Inception", 148, 8.8);
        System.out.println(movie.getInfo());

        Video tvSeries = new TvSeries("Breaking Bad", 50, 62);
        System.out.println(tvSeries.getInfo());

        // Test IntList
        IntList intList = new IntArrayList();
        for (int i = 0; i < 15; i++) {
            intList.add(i);
        }
        System.out.println("IntArrayList element at index 5: " + intList.get(5));

        IntList intVector = new IntVector();
        for (int i = 0; i < 30; i++) {
            intVector.add(i);
        }
        System.out.println("IntVector element at index 10: " + intVector.get(10));
    }
}
