package com.TrainingMug.carmanagement.controller;


import com.TrainingMug.carmanagement.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.TrainingMug.carmanagement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService service;

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return service.createCar(car);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return service.getAllCars();
    }

    @GetMapping("/search")
    public Page<Car> searchCars(
            @RequestParam(required = false, defaultValue = "") String model,
            Pageable pageable) {
        return service.searchCars(model, pageable);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car carDetails) {
        return service.updateCar(id, carDetails);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id) {
        service.deleteCar(id);
        return "Car with ID " + id + " has been deleted!";
    }
}
