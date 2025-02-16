package br.com.adapter;

import br.com.adapter.adapters.PayoneerAdpater;
import br.com.adapter.payoneer.Payoneer;
import br.com.adapter.paypal.IPaypalPayments;
import br.com.adapter.paypal.Paypal;

public class Main {

  public static void main(String[] args) {

    IPaypalPayments paypalPayments = new Paypal();
    paypalPayments.paypalPayments();
    paypalPayments.paypalReceive();

    IPaypalPayments payoneerPayments = new PayoneerAdpater(new Payoneer());
    payoneerPayments.paypalPayments();
    payoneerPayments.paypalReceive();

  }

}
