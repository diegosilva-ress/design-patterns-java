package br.com.factorymethod;

import br.com.factorymethod.vehicles.IVehicle;

public abstract class Transport {

  void startTransport() {
    IVehicle vehicle = createTransport();
    vehicle.startRoute();
  }

  protected abstract IVehicle createTransport();

}
