package com.example.demo;

public class Client {
    public static void main(String[] args) {
        String type = "正常收费";
        Double money = 1000d;
        ChargeContext chargeContext = new ChargeContext(type);
        System.out.println(chargeContext.getResult(money));
    }
}
