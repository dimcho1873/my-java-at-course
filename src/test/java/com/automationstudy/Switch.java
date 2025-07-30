package com.automationstudy;

public class Switch {
    public static void main(String[] args) {
        /*
        String color = "blue";
        switch (color) {
            case "red":
                System.out.println("Вы выбрали красный");
                break;
            case "green":
                System.out.println("Вы выбрали зеленый");
                break;
            case "blue":
                System.out.println("Вы выбрали синий");
                break;
            default:
                System.out.println("Неизвестный цвет");
                break;
        }
         */
        /*
        int day = 8; // 1-5 будни, 6-7 выходные

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Это будний день.");
                break;
            case 6:
            case 7:
                System.out.println("Это выходной день.");
                break;
            default:
                System.out.println("Неверный номер дня.");
                break;
        }
         */
                int month = 4; // Попробуй разные значения: 1, 4, 12, 13
                String season;

                switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        season = "Зима";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        season = "Весна";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        season = "Лето";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        season = "Осень";
                        break;
                    default:
                        season = "Неизвестный месяц";
                        break;
                }
                System.out.println("Месяц " + month + " относится к сезону: " + season);
            }
        }
