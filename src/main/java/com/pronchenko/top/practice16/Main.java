package com.pronchenko.top.practice16;
//ordinal -порядковый номер
//valueOf -

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Level levelLow = Level.LOW;
        Level levelHigh = Level.HIGH;

        System.out.println(levelLow.name());
        System.out.println(levelLow.ordinal());
        System.out.println(Level.valueOf("medium".toUpperCase())); // только заглавными буквами задавать названия в enum

        System.out.println(Arrays.asList(Level.values()));//values  - возвращает массивпоэтому исп. эррейс
//        System.out.println(Arrays.toString(Level.values())); - тоже что и выше
        Company company = new Company();
        Employee employee1 = new Employee("Employee1");
        Employee employee2 = new Employee("Employee2");
        Employee employee3 = new Employee("Employee3");
        employee1.setPayment(new Payment(PaymentType.SALARY, 5,1000, 0));
        employee2.setPayment(new Payment(PaymentType.FEE, 1,2000, 1));
        employee3.setPayment(new Payment(PaymentType.WAGE,4,1000, 3));
        company.getEmployees().add(employee1);
        company.getEmployees().add(employee2);
        company.getEmployees().add(employee3);
//        company.getEmployees().addAll(List.of(employee1,employee2));

        company.printReport();
    }
}
