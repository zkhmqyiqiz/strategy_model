package com.example.demo;
/**
 * ChargeNormal 表示正常收费*/
public class ChargeNormal extends Charge {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
