package br.com.adapter.payoneer;

import br.com.adapter.util.Token;

public class Payoneer implements IPayoneerPayaments {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void sendPayments() {
    System.out.println("Enviando pagamentos com Payoneer");
  }

  @Override
  public void receivePayments() {
    System.out.println("Recebendo pagamentos via Payoneer");
  }
}
