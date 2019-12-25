package com.example.cryptomoney.ui.home;

public class Transaction {
  private String amount;
  private String buying_rate;
  private String total;

  public Transaction(String amount, String buying_rate, String total) {
    this.amount = amount;
    this.buying_rate = buying_rate;
    this.total = total;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getBuying_rate() {
    return buying_rate;
  }

  public void setBuying_rate(String buying_rate) {
    this.buying_rate = buying_rate;
  }

  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }
}
