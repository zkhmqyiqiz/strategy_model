package com.example.demo.update;

public class UChargeContext {
    public UChargeNormal uChargeNormal;
    public UChargeReturn uChargeReturn;
    public UChargeRebate uChargeRebate;
    public UChargeContext(String type) {
        switch (type){
            case "正常收费":
                uChargeNormal = new UChargeNormal();
                break;
            case "满300返还100":
                uChargeReturn = new UChargeReturn();
                break;
            case "五折":
                uChargeRebate = new UChargeRebate();
                break;
        }
    }

    public Double getResult(Double money){
        money = uChargeNormal.acceptCash(money);
        return money;
    }

    public Double getResult(Double money,Double discount){
        money = uChargeRebate.acceptCash(money,discount);
        return money;
    }

    public Double getResult(Double money,Double consumeMoney,Double returnMoney){
        money = uChargeReturn.acceptCash(money,consumeMoney,returnMoney);
        return money;
    }
}
