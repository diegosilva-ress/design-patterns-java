package br.com.abstractfactory.factories;

import br.com.abstractfactory.aircrafts.IAircraft;
import br.com.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

  ILandVehicle createTransportVehicle();
  IAircraft createTransportAircraft();

}
