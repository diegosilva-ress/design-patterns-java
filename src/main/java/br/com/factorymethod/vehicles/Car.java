package br.com.factorymethod.vehicles;

public class Car implements IVehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando o trajeto");

  }

  @Override
  public void getCargo() {
    System.out.println("Já pegamos os passageiros");

  }
}
