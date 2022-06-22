package com.dayker.ex17;

/*
Все элементы массива поделить на значение наибольшего элемента этого массива.
 */

public class Main {
    public static void main(String[] args) {
        double[] array = new double[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array:");
        for (double element : array) {
            System.out.printf("%.2f ", element);
        }
        double max = 0;
        for (double element : array) {
            if (element > max) max = element;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / max;
        }
        System.out.println("\nArray divided by " + max + ":");
        for (double element : array) {
            System.out.printf("%.2f ", element);
        }
    }
}
