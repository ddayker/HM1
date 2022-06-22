package com.dayker.ex13;

/*
Напишите программу, где двум строковым переменным присваиваются значения,
третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
Затем напечатайте значение третьей строковой переменной.
 */

public class Main {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World!";
        String firstAndSecond = first + second;
        System.out.println(firstAndSecond);
    }
}
