package com.dayker.ex8;

/*
Пройти циклом по числам от 1 до 12 и вывести название месяца,
соответствующее каждому числу (используя цикл и оператор if else)
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    System.out.println("Студзень");
                    break;
                case 2:
                    System.out.println("Люты");
                    break;
                case 3:
                    System.out.println("Сакавiк");
                    break;
                case 4:
                    System.out.println("Красавiк");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Чэрвень");
                    break;
                case 7:
                    System.out.println("Лiпень");
                    break;
                case 8:
                    System.out.println("Жнiвень");
                    break;
                case 9:
                    System.out.println("Верасень");
                    break;
                case 10:
                    System.out.println("Кастрычнiк");
                    break;
                case 11:
                    System.out.println("Лiстапад");
                    break;
                case 12:
                    System.out.println("Снежань");
                    break;

            }
        }
    }
}
