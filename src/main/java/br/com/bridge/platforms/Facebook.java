package br.com.bridge.platforms;

public class Facebook implements IPlatform {

  public Facebook() {
    configureRMPT();
    System.out.println("Facebook: Transmissão Iniciada");
  }

  @Override
  public void configureRMPT() {
    authToken();
    System.out.println("Facebook: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Facebook: Autorizando app");
  }
}
