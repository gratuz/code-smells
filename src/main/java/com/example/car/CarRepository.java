package com.example.car;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface CarRepository extends CrudRepository<Car, UniqueCar> {

    Optional<Car> findById(UniqueCar Id);

}
