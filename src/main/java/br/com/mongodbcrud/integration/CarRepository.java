package br.com.mongodbcrud.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mongodbcrud.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findById(Long id);

    void deleteById(Long id);

}
