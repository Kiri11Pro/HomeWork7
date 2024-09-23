package com.pronchenko.top.practice16;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> employees = new ArrayList<>();

    public void printReport() { // метощд дял вывода отчетности
        int total = 0;
        System.out.println("ФИО \t\t\tНалог, %  \tСумма, \t Налог с учетом детей, % \t К оплате \t К оплате (грн/тугрики)");
        for (Employee employee : employees) {

            System.out.printf("%s \t\t %s \t\t%d \t\t\t\t%d \t\t\t\t  %.2f \t\t%s \n",
                    employee.getFullName(),
                    employee.getPayment().getTax(),
//                    employee.getPayment().getType().getRuName(),
                    employee.getPayment().getMoney(),
                    employee.getPayment().getTaxChildFree(),
                    employee.getPayment().getToPay(),
            employee.getPayment().getToPayGrTgr());


//            total += employee.getPayment().getMoney();
        }
//        System.out.printf("Итого \t\t\t\t\t\t\t%d", total);

    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
