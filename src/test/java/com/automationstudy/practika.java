package com.automationstudy;

import java.util.Scanner;

public class practika {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner

        System.out.print("Введите количество товаров: ");
        int quantity = scanner.nextInt(); // Читаем целое число

        System.out.print("Введите цену за единицу: ");
        double price = scanner.nextDouble(); // Читаем число с плавающей точкой

        double total = 0;

        if (quantity > 10) {
            total = (quantity * price) * 0.95;
        } else {
            total = (quantity * price);
        }
        System.out.println("Финальная стоимость: " + total);

        if (total > 1000) {
            System.out.println("Вам доступна бесплатная доставка!");
        }

        scanner.close(); // Важно закрыть Scanner, когда он больше не нужен

         */
        /*
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            System.out.print("Введите Имя студента: ");
            String studentName = scanner.nextLine();
            System.out.print("Введите оценку студента: ");
            int grade = scanner.nextInt();scanner.nextLine();
            String categoryMessage = "";
            if (grade == 5) {
                categoryMessage = "Отлично!";
            } else if (grade == 4) {
                categoryMessage = "Хорошо.";
            } else if (grade == 3) {
                categoryMessage = "Удовлетворительно.";
            } else if (grade == 2 || grade == 1) {
                categoryMessage = "Неудовлетворительно.";
            } else {
                categoryMessage = "Такой оценки не существует.";
            }
            System.out.println("Студент " + studentName + " получил оценку " + grade + "." + categoryMessage );
        }

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int number = 0;
        String success = "";
        while (number != secretNumber) {
            System.out.print("Введите число от 1 до 10: ");
            number = scanner.nextInt();
            if (number == secretNumber) {
                success = "Поздравляю! Ты угадал(а) число!";
            } else {
                System.out.println("Неверно! Попробуй еще раз.");
            }
        }
        System.out.println(success);
        scanner.close();

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number < 1);
        scanner.close();

         */
        Scanner scanner = new Scanner(System.in);
        int numberDay = 0;
        System.out.print("Введите число: ");
        numberDay = scanner.nextInt();
        switch (numberDay) {
            case 1:
                System.out.println("Понедельник");
                break;
                case 2:
                    System.out.println("Вторник");
                    break;
                    case 3:
                        System.out.println("Среда");
                        break;
                        case 4:
                            System.out.println("Четверг");
                            break;
                            case 5:
                                System.out.println("Пятница");
                                break;
                                case 6:
                                    System.out.println("Суббота");
                                    break;
                                    case 7:
                                        System.out.println("Воскресенье");
                                        break;
                                        default:
                                            System.out.println("Некорректный номер дня недели.");
        }
        scanner.close();
    }
}
