package fr.pompey.dev.afpa.encapsulation.exo1;

public class Livre {

    // Variables
    private String Titre;
    private String Auteur;
    private Integer NbPages;

    // Constructeur
    public Livre(String Titre, String Auteur, Integer NbPages) {

        this.Titre = Titre;

        this.Auteur = Auteur;

        this.NbPages = NbPages;

    }

    // Accesseur et Modificateur
    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public Integer getNbPages() {
        return NbPages;
    }

    // setter Nb de pages avec filtre
    public void setNbPages(Integer nbPages) {

        if (nbPages > 0);
        NbPages = nbPages;

    }

    // Methode


    public void afficher() {

        System.out.println("Titre : " + this.Titre + "\nauteur : " + this.Auteur + "\n" + this.NbPages);

    };

    public void changerAuteur(String newAuteur){

        this.Auteur = newAuteur;

        System.out.println("Le changement d'auteur à bien été effetué");

        afficher();

    }

    public void changerNbPages(Integer newNbPages){

        if (newNbPages > 0){

            this.setNbPages(newNbPages);

            System.out.println("Le nombres de pages du livre à été modifié");

            afficher();
        }

        else {
            System.err.println("Veuillez entrer un nombre de pages");
        }


    }

    // Ajout 2 livres + affichage
    public static void main(String[] args) {

        Livre livre1 = new Livre("Les blagues de Toto", "Bichon", 25);
        Livre livre2 = new Livre("Java pour les nuls", "Faboulous", 360);

        livre1.afficher();

        livre2.afficher();

        livre1.changerAuteur("Marcel");

        livre1.changerNbPages(300);

    }


}
