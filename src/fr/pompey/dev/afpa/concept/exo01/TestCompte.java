package fr.pompey.dev.afpa.concept.exo01;

public class TestCompte {

    public static void main(String[] args) {

        Compte monCompte = new Compte(2500);

        monCompte.afficher();

        //dépôt
        System.out.println("Opération : dépôt de 500 €");

        monCompte.deposer(1000);

        System.out.println("Nouveau solde du compte :");

        monCompte.afficher();

        //retrait
        System.out.println("Opération : retrait de 140 €");

        monCompte.deposer(140);

        monCompte.afficher();

        System.out.println("Nouveau solde du compte :");

    }

}




