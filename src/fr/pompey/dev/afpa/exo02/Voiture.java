package fr.pompey.dev.afpa.exo02;

public class Voiture {


    public String marque;
    public double prix;

    public Voiture() {

    };

    // Getter & Setter
    public String getMarque() {

        return marque;

    }

    public void setMarque(String marque) {

        this.marque = marque;

    }

    public double getPrix() {

        return prix;

    }

    public void setPrix(double prix) {

        this.prix = prix;

    }

    public void afficher() {

        System.out.println("marque: " + marque + " \nprix: " + prix);

    };

}
