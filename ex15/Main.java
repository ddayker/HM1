package com.dayker.ex15;

/*
Выведете на экран все числа от 1 до 100 с помощью цикла
(можно все три варианта в одной программе):
for, while, do while
 */

public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
