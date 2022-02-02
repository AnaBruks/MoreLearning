package Lambdas;

import java.util.function.Consumer;

class Test {
    void print() {
        System.out.println("Hello world!!!");
    }
    public static void main(String[] args) {
        Consumer<Test> c = Test::print;
        c.accept(new Test());
    }
}