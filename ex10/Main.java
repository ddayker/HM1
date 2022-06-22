package com.dayker.ex10;

import java.util.Scanner;

/*
Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
 */

public class Main {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число --> ");
        a = scanner.nextInt();
        System.out.print("Второе число --> ");
        b = scanner.nextInt();
        sum = a + b;
        System.out.println("Сумма = " + sum);
    }
}