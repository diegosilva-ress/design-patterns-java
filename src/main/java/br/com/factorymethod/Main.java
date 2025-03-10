package br.com.factorymethod;

public class Main {

  private static Transport transport;

  public static void main(String[] args) {
    configure(args[0]);
    if (transport != null) {
      runTransport();
    }
  }

  private static void configure(String type) {
    switch (type) {
      case "uber":
        transport = new CarTransport();
        break;
      case "log":
        transport = new MotorcycleTransport();
        break;
      default:
        System.out.println("Selecione o tipo de entrega");
    }
  }

  private static void runTransport() {
    transport.startTransport();
  }

}