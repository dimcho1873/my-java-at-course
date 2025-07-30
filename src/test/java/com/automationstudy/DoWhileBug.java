package com.automationstudy;

public class DoWhileBug {
    public static void main(String[] args) {
        int userInput = 2; // Представим, что это ввод пользователя

        do {
            System.out.println("Введите число (нужно 5): " + userInput);
            if (userInput < 5) {
                userInput = userInput + 2;
            } else {
                userInput = 5;
            }
        } while (userInput != 5);
    }
}