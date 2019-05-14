package com.example.demo;
/**
 * 打折类*/
public class ChargeRebate extends  Charge {
    private Double discount;//折扣

    public ChargeRebate(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double acceptCash(Double money) {
        Double result = money * discount;//实际收钱
        return result;
    }
}
