package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {
    public static List<Car> getMyCars() {
        return Arrays.asList(
                new Car("Mazda", "6", "navy", new BigDecimal("45000.00"), 5),
                new Car("BMW", "E36", "black", new BigDecimal("25000.00"), 2),
                new Car("Nissan", "Primera", "red", new BigDecimal("30000"), 1),
                new Car("Skoda", "Octavia", "green", new BigDecimal("10000"), 3),
                new Car("Volkswagen", "Golf GTI", "black", new BigDecimal("32500"), 2)
        );
    }
}
