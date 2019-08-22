package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception
    {
        Car car;
        car = new Car("Toyota", "Corola", 1998);
        repository.save(car);

        car = new Car("Toyota", "Camry", 2009);
        repository.save(car);

        car = new Car("Nisssan", "Altima", 2018);
        repository.save(car);
    }

}
