package br.com.mongodbcrud.service;

import java.util.List;

import br.com.mongodbcrud.domain.Car;

public interface CarService {

    List<Car> listAllCar();

    void createCar(Car car);

    Car readCar(Long id);

    void updateCar(Car car);

    void deleteCar(Long id);
}
