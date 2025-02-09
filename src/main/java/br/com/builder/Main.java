package br.com.builder;

import br.com.builder.builders.CarBuilder;
import br.com.builder.builders.TruckBuilder;
import br.com.builder.cars.Car;
import br.com.builder.cars.Truck;
import br.com.builder.director.Director;

public class Main {

  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder carBuilder = new CarBuilder();
    director.constructSedanCar(carBuilder);

    Car car = carBuilder.getResult();
    System.out.println(car.result() + " produzido com sucesso!");

    TruckBuilder truckBuilder = new TruckBuilder();
    director.constructTruck(truckBuilder);

    Truck truck = truckBuilder.getResult();
    System.out.println(truck.result() + " produzido com sucesso!");

  }

}
