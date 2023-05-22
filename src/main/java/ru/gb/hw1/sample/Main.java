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
     * <p>
     * <p>
     * FROM bellsoft/liberica-openjdk-alpine:11.0.16
     * COPY ./java ./src
     * RUN mkdir ./out
     * RUN javac -sourcepath ./src -d out src/ru/gb/hw1/sample/Main.java
     * CMD java -classpath ./out ru.gb.hw1.sample.Main
     * <p>
     * docker build . -t myapp:latest
     * docker run myapp:latest
     * <p>
     * <p>
     * FROM bellsoft/liberica-openjdk-alpine:11.0.16 as BuildProject
     * WORKDIR /app
     * COPY ./java ./src
     * RUN mkdir ./out
     * RUN javac -sourcepath ./src -d out src/ru/gb/hw1/sample/Main.java     *
     * FROM scratch as OutputFiles
     * COPY --from=BuildProject /app/out /bin
     * <p>
     * <p>
     * docker buildx build --output type=local,dest=. .
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