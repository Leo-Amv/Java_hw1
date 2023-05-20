package ru.gb.hw1.regular;

/**
 * Декоратор.Накладывает на результат декорации.
 */
public class Decorator {
    /**
     * Метод выводит число в консоль, добавляя к нему строку при помощи функции форматированния строк
     *
     * @param a Число для декорирования
     * @return Возвращает отформатированную строку с числом "а"
     */
    public static String decorate(int a) {
        return String.format("Here is your number: %d.", a);
    }
}
