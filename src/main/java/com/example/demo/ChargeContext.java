package com.example.demo;

public class ChargeContext {
    public Charge charge =null;
    public String type;

    public ChargeContext(String type) {
        switch (type){
            case "正常收费":
                charge = new ChargeNormal();
                break;
            case "满300返还100":
                charge = new ChargeReturn(300d,100d);
                break;
            case "五折":
            charge = new ChargeRebate(0.5d);
            break;
        }
    }

    public Double getResult(Double money){
        money = charge.acceptCash(money);
        return money;
    }
}
