package com.dayker.ex2;

import java.util.Scanner;

/*
Напишите метод, который будет увеличивать каждый элемент массива на 10%.
 */

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:\n--> ");
        size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент " + (i + 1) + " --> ");
            array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i] * 0.1;
        }
        for (double element : array) {
            System.out.print(element + " ");
        }
    }
}
