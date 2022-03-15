package com.tistory.workshop6349.strategy;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(new Jumper());
        Person person2 = new Person(new Runner());

        person1.action();
        person2.action();

        person2.changeAction(new Jumper());
        person2.action();
    }

}
