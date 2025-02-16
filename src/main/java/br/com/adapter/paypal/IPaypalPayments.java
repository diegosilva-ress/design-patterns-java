package br.com.adapter.paypal;

import br.com.adapter.util.Token;

public interface IPaypalPayments {

  Token authToken();
  void paypalPayments();
  void paypalReceive();

}
