package fr.pompey.dev.afpa.concept.exo01;

/**
 * Classe Compte
 * @author GenceFabien - CDA23016
 * classe qui représente un compte bancaire
 */

public class Compte {

    /**
     * Déclaration des éléments static
     */

    // attributs
    public double solde;

    // construct

    /**
     * Instanciation de "Compte"
     *
     * @param solde le solde
     *
     */

    public Compte(double solde) {

        this.solde = solde;

    };

    // getter
    public double getSolde() {

        return solde;

    }

    // setter
    private void setSolde(double solde) {

        this.solde = solde;

    }


    /**
     * Déclaration des éléments d'instance
     */


    // methodes
    public void deposer(double credit) {

        this.solde = this.solde + credit;

    };

    public void retirer(double credit) {

        this.solde = this.solde - credit;

    };

    public void afficher() {

        System.out.println("Le solde du compte est : " + this.solde + " €");

    };

}
