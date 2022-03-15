package com.tistory.workshop6349.strategy;

public class Person {

    private PersonInterface person;

    public Person(PersonInterface person) {
        this.person = person;
    }

    public void action() {
        person.action();
    }

    public void changeAction(PersonInterface personInterface) {
        this.person = personInterface;
    }

}
