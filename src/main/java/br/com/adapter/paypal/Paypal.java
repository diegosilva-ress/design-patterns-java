package br.com.adapter.paypal;

import br.com.adapter.util.Token;

public class Paypal implements IPaypalPayments {

  private Token token;

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayments() {
    this.token = authToken();
    System.out.println("Enviando pagamentos com Paypal");
  }

  @Override
  public void paypalReceive() {
    System.out.println("Recebendo pagamentos via Paypal");
  }
}
