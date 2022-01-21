package com.example.themortgageapp;

public class MortgageModel {
    public int payMoney;
    public double payInterest;
    public int payPeriod;


    public MortgageModel (String p, String a , String i ) {
        this.payMoney = Integer.parseInt(p);
        this.payPeriod = Integer.parseInt(a);
        this.payInterest = Double.parseDouble(i);
    }


    // p is principle(money) , a is amortization period (in years ) , i is interest rate (annual percent).
    // return a monthly payment. Calculation formula is rp / 1 - (1+ r)^ -n.
    // n is a * 12 and P is the principle and r is percentage in the formula.
    // r is monthly interest and n is month version of period.

    public String computePayment() {
        int periodMonth = this.payPeriod * 12;
        double interestMonth = this.payInterest / 1200.00;

        double monthlyPay =  (this.payMoney * interestMonth)/(1 - Math.pow(1+ interestMonth ,(-1)* periodMonth));

        return "$" + String.format("%,.2f", monthlyPay);



    }



}