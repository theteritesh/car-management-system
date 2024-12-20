package com.TrainingMug.carmanagement.service;


import com.TrainingMug.carmanagement.model.Car;
import com.TrainingMug.carmanagement.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public Car createCar(Car car) {
        return repository.save(car);
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }

    public Page<Car> searchCars(String model, Pageable pageable) {
        return repository.findByModelContainingIgnoreCase(model, pageable);
    }

    public Car updateCar(Long id, Car carDetails) {
        Car car = repository.findById(id).orElseThrow();
        car.setName(carDetails.getName());
        car.setModel(carDetails.getModel());
        car.setYear(carDetails.getYear());
        car.setPrice(carDetails.getPrice());
        car.setColor(carDetails.getColor());
        car.setFuelType(carDetails.getFuelType());
        return repository.save(car);
    }

    public void deleteCar(Long id) {
        repository.deleteById(id);
    }
}
