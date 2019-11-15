package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarFilter {

    public List<Car> findCarOfColor(List<Car> cars, String color){
        List<Car> lista = new ArrayList<>();
        for (Car car: cars){
            if(car.getColor().equals(color)){
                lista.add(car);
            }
        }
//        for (int i=0; i<cars.size(); i++){
//            if(cars.get(i).getColor().equals(color)){
//                lista.add(cars.get(i));
//            }
//        }
        return lista;
    }

    public static List<Car> findCarOfColorJava8(List<Car> cars, String color) {

        return cars.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());

//        return Collections.emptyList();
    }

    public static List<Car> getCarsWithGivenEngineAndCostsLessThan(List<Car> cars, BigDecimal maxPrice, int minimalEngine){

        return cars.stream()
                .filter(car -> car.getPrice().compareTo(maxPrice) == -1 )
                .filter(car -> car.getEngine() > minimalEngine)
                .collect(Collectors.toList());

    }

    public static List<Car> filterCars(List<Car> cars, Predicate<Car> myFilter)
    {
        return cars.stream()
                .filter(myFilter)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(findCarOfColorJava8(CarProvider.getMyCars(), "black"));
        System.out.println(getCarsWithGivenEngineAndCostsLessThan(CarProvider.getMyCars(), new BigDecimal("30000"), 1));
        filterCars(CarProvider.getMyCars(), car -> car.getBrand().equals("Mazda"))
                .forEach(car -> System.out.println(car));
        filterCars(CarProvider.getMyCars(), car -> car.getBrand().equals("Mazda") && car.getColor().equals("black"))
                .forEach(car -> System.out.println(car));
    }
}
