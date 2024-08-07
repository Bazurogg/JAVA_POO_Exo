package fr.pompey.dev.afpa.exo04.geometry;

public class Point {

    private double Abscisse;
    private double Ordonnee;

    public Point(double Abscisse, double Ordonnee) {

        this.Abscisse = Abscisse;
        this.Ordonnee = Ordonnee;

    }

    public double getAbscisse() {

        return Abscisse;

    }

    public void setAbscisse(double abscisse) {

        Abscisse = abscisse;

    }

    public double getOrdonnee() {

        return Ordonnee;

    }

    public void setOrdonnee(double ordonnee) {

        Ordonnee = ordonnee;

    }


}
