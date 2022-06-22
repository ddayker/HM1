package com.dayker.ex18;

import java.util.Scanner;

/*
Напишите метод переводящий рубли в доллары по заданному курсу.
В качестве аргументов укажите кол-во рублей и курс.
 */

public class Main {
    public static void main(String[] args) {
        double money, exchangeRate;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите курс рубля к доллару:\n1 BYN = ");
        exchangeRate = scanner.nextDouble();
        System.out.print("Введите сумму (BYN) --> ");
        money = scanner.nextDouble();
        System.out.print(money + " BYN = " + (money * exchangeRate) + "$");
    }
}
