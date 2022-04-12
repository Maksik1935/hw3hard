package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task6();
        task7();
    }

    static void task6() {
        int age = 19;
        int salary = 58000;
        double limit;
        if(age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if(salary > 80000) {
            limit = limit * 1.5;
        } else if (salary > 50000) {
            limit = limit * 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }
    static void task7() {
        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        double creditRatePercent = 10;
        if(age < 23) {
            creditRatePercent = creditRatePercent + 1.0;
        } else if (age < 30) {
            creditRatePercent = creditRatePercent + 0.5;
        }
        if(salary > 80000) {
            creditRatePercent = creditRatePercent - 0.7;
        }
        double monthlyCreditPayment = (wantedSum + wantedSum * creditRatePercent/100) / 12;
        boolean total = monthlyCreditPayment < salary/2;
        if(total) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary/2 + " рублей. Платеж по кредиту " + monthlyCreditPayment + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary/2 + " рублей. Платеж по кредиту " + monthlyCreditPayment + " рублей. Отказано.");
        }
    }


}
