package br.com.builder.builders;

import br.com.builder.cars.Truck;
import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class TruckBuilder implements IBuilder {

  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;

  @Override
  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  @Override
  public void setSeats(Integer seats) {
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Truck getResult() {
    return new Truck(carType, seats, engine, transmission);
  }

}
