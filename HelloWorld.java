package ru.geekbrains.java_one.lesson_a.practice;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(taskOne(6, 7, 17, 4));
        System.out.println(taskTwo(16, 2));
        System.out.println(taskTwo(11, 27));
        taskThree(-22222229);
        taskThree(77);
        taskFour("Семен");
        taskFive(403);
        taskFive(1600);
        taskFive(300);
        taskFive(2004);
    }

    public static float taskOne(int a, int b, int c, int d) {
        return a * (b + (1f * c / d));
    }

    public static boolean taskTwo(int arg1, int arg2) {
        return arg1 + arg2 >= 10 && arg1 + arg2 <= 20;
    }

    public static void taskThree(int n) {
        if (n < 0) {
            System.out.println(n + " - отрицательное число");
        }
        else {
            System.out.println(n + " - положительное число");
       }
    }
    public static void taskFour (String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void taskFive (int year) {
        boolean isLeapYear = false;
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
}
