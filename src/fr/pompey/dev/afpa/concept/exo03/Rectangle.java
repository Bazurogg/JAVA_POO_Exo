package fr.pompey.dev.afpa.concept.exo03;

public class Rectangle {

    public double Longueur;
    public double Largeur;

    public Rectangle(double Longueur, double Largeur) {

        this.Longueur = Longueur;
        this.Largeur = Largeur;

    }

    public double getLongueur() {
        return Longueur;
    }

    public void setLongueur(double longueur) {
        Longueur = longueur;
    }

    public double getLargeur() {
        return Largeur;
    }

    public void setLargeur(double largeur) {
        Largeur = largeur;
    }

    public double aireRectangle(){

        return this.Longueur * this.Largeur;

    }

    public double perimetreRectangle(){

        return (this.Longueur + this.Largeur)*2;

    }

    public void afficher(){

        double surface = aireRectangle();
        double perimetre = perimetreRectangle();

        System.out.println("Caractéristiques du rectangle :");
        System.out.println("Longueur : " + this.Longueur + " cm");
        System.out.println("Largeur : " + this.Largeur + " cm");
        System.out.println("Surface : " + surface + " cm^2");
        System.out.println("Périmètre : " + perimetre + " cm");

    }

}
