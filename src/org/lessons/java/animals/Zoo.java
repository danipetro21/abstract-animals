package org.lessons.java.animals;

public class Zoo {

    public static void main(String[] args) {



        Cane doggo = new Cane();
        Delfino delf = new Delfino();
        Passerotto pass = new Passerotto();
        Aquila aqu = new Aquila();


        Animale[] farm = new Animale[4];
        farm[0] = new Cane();
        farm[1] = new Passerotto();
        farm[2] = new Aquila();
        farm[3] = new Delfino();


        for (Animale a : farm) {
            a.verso();
            a.dormi();
        }


        doggo.mangia("croccantini");
        delf.mangia("vermi");
        pass.mangia("conigli");
        aqu.mangia("alghe");


        faiVolare(aqu);
        faiNuotare(delf);


    }

    public static void faiVolare(canFly animale) {
        animale.vola();
    }

    public static void faiNuotare(canSwim animale) {
        animale.nuota();
    }
}
