package br.com.abstractfactory;

import br.com.abstractfactory.app.Application;
import br.com.abstractfactory.factories.ITransportFactory;
import br.com.abstractfactory.factories.NineNineTransport;
import br.com.abstractfactory.factories.UberTransport;

public class Main {

  public static Application configureApplication(String type) {
    Application app;
    ITransportFactory factory;

    if (type.equals("uber")) {
      factory = new UberTransport();
    } else {
      factory = new NineNineTransport();
    }

    app = new Application(factory);

    return app;
  }

  public static void main(String[] args) {
    Application application = configureApplication("uber");
    application.startRoute();
  }

}
