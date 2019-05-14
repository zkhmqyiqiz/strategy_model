package com.example.demo;

public class ChargeReturn extends Charge {
    private Double consumeMoney;//消费金额
    private Double returnMoney;//返还金额

    public ChargeReturn(Double consumeMoney, Double returnMoney) {
        this.consumeMoney = consumeMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public Double acceptCash(Double money) {
        if(money >= consumeMoney){
            money = money - returnMoney;
        }
        return money;
    }
}
