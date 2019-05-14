package com.example.demo.update;

public class UChargeReturn extends UCharge {
    @Override
    public Double acceptCash(Double money) {
        return super.acceptCash(money);
    }

    public Double acceptCash(Double money,Double consumeMoney,Double returnMoney) {
        if(money >= consumeMoney){
            money = money - returnMoney;
        }
        return money;
    }
}
