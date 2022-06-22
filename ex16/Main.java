package com.dayker.ex16;

import java.util.Scanner;

/*
Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
Минимум, максимум и шаг указываются пользователем (можно захардкодить).
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max, step;
        for (; ; ) {
            System.out.print("Введите минимум --> ");
            min = scanner.nextInt();
            System.out.print("Введите максимум --> ");
            max = scanner.nextInt();
            if (max <= min) {
                System.out.println("Значение максимума должно превышать значение минимума.");
            } else break;
        }
        for (; ; ) {
            System.out.print("Введите шаг --> ");
            step = scanner.nextInt();
            if (step < 1) System.out.println("Шаг должен быть больше нуля.");
            else break;
        }
        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
    }
}
