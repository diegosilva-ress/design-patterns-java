package br.com.bridge.platforms;

public class Youtube implements IPlatform {

  public Youtube() {
    configureRMPT();
    System.out.println("Youtube: Transmissão Iniciada");
  }

  @Override
  public void configureRMPT() {
    authToken();
    System.out.println("Youtube: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Youtube: Autorizando app");
  }



}
