package com.example.demo.update;

public class UClient {
    public static void main(String[] args) {
        String type = "正常收费";
        Double money = 1000d;
        UChargeContext uChargeContext = new UChargeContext(type);
        System.out.println(uChargeContext.getResult(money));
    }
}
/**
 * 总结：相比较与demo中的策略方法的实现，update中策略方法实现的缺点：
 * 1.每一个方法的实现需要重写UChargeContext调用的getResult方法，这样导致封装不彻底。
 * 2.UchargeContext方法的实现中，每一个子类都必须有一种方法，导致代码有一定的冗余
 * 3.注意事项：子类继承父类的时候，对应父类的方法不同同时进行重载和重写，只能分别进行其中的一种*/
