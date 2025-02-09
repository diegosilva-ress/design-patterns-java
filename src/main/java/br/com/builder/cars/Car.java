package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Car {

  private CarType carType;
  private int seats;
  private Engine engine;
  private Transmission transmission;

  public Car(CarType carType, int seats, Engine engine, Transmission transmission) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
  }

  public String result() {
    String result = "Car with motor: " + getEngine().getPower() + "\n";
    result += "Transmission: " + getTransmission();

    return result;
  }

  public CarType getCarType() {
    return carType;
  }

  public int getSeats() {
    return seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transmission getTransmission() {
    return transmission;
  }
}
