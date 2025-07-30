package com.automationstudy;

public class LoopTasks {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int i = 1;
        int totalSum = 0;
        while (i >= 1 && i <= 100) {
            totalSum = totalSum + i;
            System.out.println("На шаге" + i + " прибавили " + i + ", текущая сумма = " + totalSum);
            i++;
        }
        System.out.println("Общая сумма = " + totalSum);

        int userNumber = 0;
        do {
            userNumber++;
            System.out.println(userNumber);
        } while (userNumber <= 10);

        String[] cities = {"Москва", "Питер", "Казань", "Сочи"};
        for (String citi : cities) {
            System.out.println("Я люблю город: " + citi);
        }

        int counter = 10;
        while (counter > 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        int n = 7;
        int result = 1;
        while (n > 0) {
            result = result * n;
            n--;
        }
        System.out.println("Result is: " + result);
    }
}
