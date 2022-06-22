package com.dayker.ex14;

import java.util.Scanner;

/*
Создайте программу с двумя переменными целого типа,
присвойте им значения, если первая переменная больше второй,
то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8.
В конце программы выведите значения обоих чисел на экран.
 */

public class Main {
    public static void main(String[] args) {
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число --> ");
        first = scanner.nextInt();
        System.out.print("Введите второе число --> ");
        second = scanner.nextInt();
        if(first>second) first+=3;
        else second+=8;
        System.out.println("First = "+first+", Second = "+second);

    }

}
