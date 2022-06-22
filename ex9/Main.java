package com.dayker.ex9;

/*
Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
чтобы значение первой оказалось во второй, а второй - в первой.
 */

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 9;
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
