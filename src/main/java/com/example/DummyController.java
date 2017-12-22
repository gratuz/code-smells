package com.example;


import com.example.car.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dummy")
@Component
public class DummyController {


  @Autowired
  CarService cars;


  @GetMapping(value = "/cars")
  public ResponseEntity<Iterable> GetCars() {

      return ResponseEntity.ok(cars.Get());

  }

  @GetMapping(value = "/cars/{year}/{make}/{model}")
  public ResponseEntity<Car> GetCar(@PathVariable int year, @PathVariable String make, @PathVariable String model) {

    UniqueCar uc = new UniqueCar(make,model,"",year);

    return ResponseEntity.ok(cars.Get(uc));

  }


  @GetMapping(value = "/cars/{year}/{make}/{model}/{trim}")
  public ResponseEntity<Car> GetCar(@PathVariable int year, @PathVariable String make, @PathVariable String model, @PathVariable String trim) {

    UniqueCar uc = new UniqueCar(make,model,trim,year);

    return ResponseEntity.ok(cars.Get(uc));

  }


  @PostMapping(value = "/cars")
  public ResponseEntity<Car> PostCar(@RequestBody Car c) {

    return ResponseEntity.ok(cars.Create(c));

  }



}
