package com.pronchenko.top.practice16;

public class Payment{
    private PaymentType type;

    private int workAmount; // для ввода выполненной работы
    private int cost; //цена выполненной работы за день/час/изделие
    private int tax; //налог
    private int taxChildFree; // налог с учетом наличия детей
    private double toPay;
    private String toPayGrTgr;
    private int children;



    public int getMoney(){
        return workAmount*cost;
    }
    public int getTax(){
        if(type == PaymentType.SALARY || type ==PaymentType.WAGE){
            tax = 20;        }
        else{
            tax = 15;
        }
        return tax;
    }
    public int getTaxChildFree(){
        if ( children > 0){
            taxChildFree=tax+5;
        }else taxChildFree = tax;
        return taxChildFree;
    }
    public double getToPay(){
        toPay = (1-(double) taxChildFree/100)*getMoney();

        return toPay;
    }
    public String getToPayGrTgr(){
        if (type == PaymentType.WAGE){
            toPayGrTgr = toPay/2 +"/" + toPay/2/8;
        }else toPayGrTgr = toPay+"";
        return toPayGrTgr;
    }



    public Payment(PaymentType type, int workAmount, int cost, int children) {
        this.type = type;
        this.workAmount = workAmount;
        this.cost = cost;
        this.children = children;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public int getWorkAmount() {
        return workAmount;
    }

    public void setWorkAmount(int workAmount) {
        this.workAmount = workAmount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setTaxChildFree(int taxChildFree) {
        this.taxChildFree = taxChildFree;
    }

}
