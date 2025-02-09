package br.com.abstractfactory.app;

import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.factories.ITransportFactory;
import br.com.abstractfactory.landvehicles.ILandVehicle;

public class Application {

  private ILandVehicle vehicle;
  private IAircraft aircraft;

  public Application(ITransportFactory factory) {
    vehicle = factory.createTransportVehicle();
    aircraft = factory.createTransportAircraft();
  }

  public void startRoute() {
    vehicle.startRoute();
    aircraft.startRoute();
  }

}
