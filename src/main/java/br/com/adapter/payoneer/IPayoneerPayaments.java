package br.com.adapter.payoneer;

import br.com.adapter.util.Token;

public interface IPayoneerPayaments {

  Token authToken();
  void sendPayments();
  void receivePayments();

}
