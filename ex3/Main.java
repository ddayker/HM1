package com.dayker.ex3;

import java.util.Scanner;

/*
Напишите метод, который будет проверять является ли число палиндромом
(одинаково читающееся в обоих направлениях).
 */

public class Main {
    public static void main(String[] args) {
        int number, palindrome = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число --> ");
        number = scanner.nextInt();
        int temp = number;
        while (temp > 0) {
            palindrome = palindrome * 10 + temp % 10;
            temp /= 10;
        }
        if (number == palindrome)
            System.out.println("Число является палиндромом.");
        else System.out.println("Число НЕ является палиндромом.");
    }
}
