package com.dayker.ex5;

/*
Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }
}
