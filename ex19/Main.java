package com.dayker.ex19;

import java.util.Scanner;

/*
Напишите программу, которая будет считать количество часов,
 минут и секунд в n-ном количестве суток.
 */

public class Main {
    public static void main(String[] args) {
        int days;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days --> ");
        days = scanner.nextInt();
        System.out.print(days + " days = " + (days * 24) + " hours = " + (days * 24 * 60) + " minutes = " + (days * 24 * 60 * 60) + " seconds");
    }
}
