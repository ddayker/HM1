package com.dayker.ex1;

import java.util.Scanner;

/*
Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
что сила тяжести равна 16% от силы тяжести на Земле.
*/

public class Main {
    public static void main(String[] args) {
        double gEarth = 9.8;
        double gMoon = gEarth * 0.16;
        double weight;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш вес (кг):\n--> ");
        weight = scanner.nextDouble();
        System.out.println("Ваш вес на луне равен " + weight * gMoon / gEarth + " кг.");
    }
}
