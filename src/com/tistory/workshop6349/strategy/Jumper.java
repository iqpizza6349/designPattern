package com.tistory.workshop6349.strategy;

public class Jumper implements PersonInterface {

    @Override
    public void action() {
        System.out.println("이동한다.");
    }
}
