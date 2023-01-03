package iliikata.h2try.service;

import iliikata.h2try.model.Car;
import iliikata.h2try.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    public Car findById(int id){
        return carRepository.findById(id).orElse(new Car());
    }
    public Iterable<Car>findAll(){
        return carRepository.findAll();
    }
    public Car save(Car car){
        return carRepository.save(car);
    }
    public void delete(Car person){
        carRepository.delete(person);
    }
}
