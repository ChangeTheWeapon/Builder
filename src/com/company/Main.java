package com.company;

public class Main {

    public static void main(String[] args) {
        BuilderPattern.Coffee coffee = new BuilderPattern.Coffee.Builder("Mocha").milk(true).sugar(false).size("Large").build();
        System.out.println(coffee);

    }
}
