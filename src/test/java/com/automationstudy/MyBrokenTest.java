package com.automationstudy;

import org.testng.annotations.Test;

public class MyBrokenTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a - b; // Вот здесь что-то не так...

        // Мы хотим, чтобы тест упал, если sum не равна 15.
        // Но сейчас он просто выведет сообщение.
        // Нужно использовать TestNG для проверки.
        if (sum == 15) {
            System.out.println("Сумма правильная!");
        } else {
            System.out.println("Ошибка: Сумма неверная!");
        }
    }
}