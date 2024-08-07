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

    public void testAppartenance(Point p){

        // calcul de la distance entre les coordonnées en abscisse du point et le centre du cercle

        double distancePx = (p.getAbscisse() - this.centre.getAbscisse());
        double distancePy = (p.getOrdonnee() - this.centre.getOrdonnee());

        double distanceP = Math.sqrt(distancePx*distancePx + distancePy*distancePy);

        // on fais la comparaison entre notre distance "distanceP" du point et le rayon du cercle
        if (distanceP == this.rayon){

            System.out.println("Le point appartiens bien au cercle :) !");

        }
        else {

            System.out.println("Le point n'appartiens pas au cercle :( !");

        }

    }

    public void afficher(){



        
    }









}
