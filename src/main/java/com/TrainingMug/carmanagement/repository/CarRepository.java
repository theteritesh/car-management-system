package com.TrainingMug.carmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.TrainingMug.carmanagement.model.Car;

//import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
//    List<Car> findByNameContainingOrModelContainingOrYear(String name, String model, int year);
	 Page<Car> findByModelContainingIgnoreCase(String model, Pageable pageable);
}
