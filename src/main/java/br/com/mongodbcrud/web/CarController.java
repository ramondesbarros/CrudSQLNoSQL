package br.com.mongodbcrud.web;

import static br.com.mongodbcrud.domain.MongoDBCrudConstants.CAR_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mongodbcrud.domain.Car;
import br.com.mongodbcrud.service.CarService;

@RestController
@RequestMapping(CAR_ENDPOINT)
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Car car) {
        carService.createCar(car);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Car>> read() {
        return new ResponseEntity<List<Car>>(carService.listAllCar(), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
