package ru.gb.hw1.sample;

import ru.gb.hw1.regular.Decorator;
import ru.gb.hw1.regular.OtherClass;

public class Main {

    /**
     * javac -sourcepath ./java -d out java/ru/gb/hw1/sample/Main.java
     * <p>
     * java -classpath ./out ru.gb.hw1.sample.Main
     * <p>
     * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
     */
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