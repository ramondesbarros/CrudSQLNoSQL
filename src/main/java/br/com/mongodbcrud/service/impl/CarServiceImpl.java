package br.com.mongodbcrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mongodbcrud.domain.Car;
import br.com.mongodbcrud.integration.CarRepository;
import br.com.mongodbcrud.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listAllCar() {
        return carRepository.findAll();
    }

    @Override
    public void createCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public Car readCar(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public void updateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

}
