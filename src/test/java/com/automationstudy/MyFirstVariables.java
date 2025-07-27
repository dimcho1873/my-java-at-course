package com.automationstudy;

public class MyFirstVariables {
    public static void main(String[] args) {
        /*  int num1 = 15;
        int num2 = 4;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Результат сложения: " + sum);
        System.out.println("Результат вычитания: " + difference);
        System.out.println("Результат умножения: " + product);
        System.out.println("Результат деления: " + quotient);
        System.out.println("Результат остатка от деления: " + remainder);
        boolean isSunny = true;
        boolean isWeekend = false;
        boolean picnic = isSunny && isWeekend;
        boolean isRainy = isSunny || isWeekend;
        boolean pasmurno = !isSunny;
        System.out.println("Можно ли пойти на пикник?" + picnic);
        System.out.println("Можно ли выйти на прогулку?" + isRainy);
        System.out.println("Пасмурно ли?" + pasmurno);

        int age = 17;
        int minAgeForDriving = 18;
        boolean driving = (age >= minAgeForDriving);
        System.out.println("Можно ли водить: " + driving);
*/
        int temp = 25;
        boolean isHoliday = true;
        boolean hasTickets = false;

        if ((temp > 20 && isHoliday) || hasTickets) {
            System.out.println("Сегодня отличный день для поездки!");
        } else {
            System.out.println("Лучше остаться дома.");
        }
    }
}
