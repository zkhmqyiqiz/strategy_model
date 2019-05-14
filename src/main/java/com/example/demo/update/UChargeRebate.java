package com.example.demo.update;

public class UChargeRebate extends UCharge {
    public Double acceptCash(Double money,Double discount) {
        money = money * discount;
        return money;
    }
}
