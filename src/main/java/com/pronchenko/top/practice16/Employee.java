package com.pronchenko.top.practice16;

public class Employee {
    private String fullName;
    private Payment payment;
//    public int children;


    public Employee(String fullName/*, int children*/) {
        this.fullName = fullName;
//        this.children = children;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

//    public int getChildren() {
//        return children;
//    }
//
//    public void setChildren(int children) {
//        this.children = children;
//    }
}
