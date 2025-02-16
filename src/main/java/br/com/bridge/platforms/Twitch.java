package br.com.bridge.platforms;

public class Twitch implements IPlatform {

  public Twitch() {
    configureRMPT();
    System.out.println("Twitch: Transmissão Iniciada");
  }

  @Override
  public void configureRMPT() {
    authToken();
    System.out.println("Twitch: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Twitch: Autorizando app");
  }

}
