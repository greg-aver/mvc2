package web.service;

import web.madel.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getListCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("tesla", 111, 0));
        carList.add(new Car("zgiga", 123, 100));
        carList.add(new Car("tayota", 321, 2));
        return carList;
    }
}
