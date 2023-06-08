package org.lessons.java.animals;

public class Passerotto extends Animale implements canFly{


    @Override
    public void verso() {
        System.out.println("Chipp");
    }

    @Override
    public void vola() {
        System.out.println("i can fly");
    }
}
