package ru.gb.hw1.sample;

import ru.gb.hw1.regular.Decorator;
import ru.gb.hw1.regular.OtherClass;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(23, 45);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(12, 4);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(34, 45);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(45, 56);
        System.out.println(Decorator.decorate(result));
    }
}