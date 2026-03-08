package org.example;

public class Calc {
    public int summ(int a, int b) {
        int resultSum = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + resultSum);
        return resultSum;
    }

    public int diff(int c, int d){
        int resultDif = c - d;
        System.out.println("Разность " + c + " и " + d + " равна "+ resultDif);
        return resultDif;
    }
}
