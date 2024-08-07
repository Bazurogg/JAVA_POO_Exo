package fr.pompey.dev.afpa.exo04.geometry;

public class Cercle {

    // attributs
    private Point centre;
    private double rayon;

    // construct
    public Cercle(Point centre, double rayon) {

        this.centre = centre;

        this.rayon = rayon;

    }

    // getter & setter
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // methodes
    public double perimetreCercle(){

         return 2 * Math.PI * rayon;

    }

    public double aireCercle(){

        return Math.PI * rayon * rayon;

    }







}
