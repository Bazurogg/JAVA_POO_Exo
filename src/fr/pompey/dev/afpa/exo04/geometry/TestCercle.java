package fr.pompey.dev.afpa.exo04.geometry;

public class TestCercle {

    public static void main(String[] args) {

        Point centre = new Point(2.0,0.0);

        Cercle Cercle1 = new Cercle(centre,10.0);

        Point P = new Point(12.0,0.0);

        Cercle1.afficherCercle();

        Cercle1.testAppartenance(P);

    }

}
