package com.pronchenko.top.practice16;

public enum PaymentType {
    SALARY("ставка"),
    WAGE("почасовая"),
    FEE("сдельная");//СТАВКА, ПОЧАСОВАЯ, СДЕЛЬНАЯ
    private final String ruName;

    PaymentType(String name) {
        this.ruName = name;
    }
    public String getRuName(){
        return ruName;
    }


}
