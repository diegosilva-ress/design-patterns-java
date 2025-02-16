package br.com.adapter.adapters;

import br.com.adapter.payoneer.Payoneer;
import br.com.adapter.paypal.IPaypalPayments;
import br.com.adapter.util.Token;

public class PayoneerAdpater implements IPaypalPayments {

  private Token token;
  private Payoneer payoneer;

  public PayoneerAdpater(Payoneer payoneer) {
    this.payoneer = payoneer;
    System.out.println("Adaptando o Payoneer utlizando os métodos padrões do Paypal");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayments() {
    this.payoneer.sendPayments();

  }

  @Override
  public void paypalReceive() {
    this.payoneer.receivePayments();
  }
}
