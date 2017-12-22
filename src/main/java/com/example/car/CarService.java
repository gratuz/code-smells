package com.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CarService {

    @Autowired
    CarRepository cars;


    public Iterable<Car> Get(){

        return cars.findAll();
    }

    public Car Get(UniqueCar uc){
        return cars.findOne(uc);
    }

    public Car Create(Car c){

        return cars.save(c);
    }
}
