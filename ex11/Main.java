package com.dayker.ex11;

import java.util.Scanner;

/*
Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
 */

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число --> ");
        a = scanner.nextInt();
        System.out.print("Второе число --> ");
        b = scanner.nextInt();
        System.out.print("Третье число --> ");
        c = scanner.nextInt();
        System.out.println("Наибольшее = "+Math.max(a,Math.max(b,c)));
    }
}
