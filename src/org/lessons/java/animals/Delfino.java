package org.lessons.java.animals;

public class Delfino extends Animale implements canSwim{



    @Override
    public void verso() {
        System.out.println("biosonar");
    }

    @Override
    public void nuota() {
        System.out.println("i can swim");
    }
}
