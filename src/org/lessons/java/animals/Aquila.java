package org.lessons.java.animals;

public class Aquila extends Animale implements canFly{


    @Override
    public void verso() {
        System.out.println("Strick");
    }

    @Override
    public void vola() {
        System.out.println("i can fly");
    }
}
