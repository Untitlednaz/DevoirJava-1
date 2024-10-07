import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

    public static void main(String[] args) {
        // Étape 1 : Créer le jeu de cartes
        ArrayList<Carte> deck = new ArrayList<>();
        for (String couleur : Carte.COULEURS) {
            for (int i = 0; i < Carte.VALEURS.length; i++) {
                deck.add(new Carte(couleur, i));
            }
        }

        // Étape 2 : Mélanger le jeu
        Collections.shuffle(deck);

        // Étape 3 : Créer les deux joueurs
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");

        // Étape 4 : Distribuer les cartes
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                joueur1.ajouterCarte(deck.get(i));
            } else {
                joueur2.ajouterCarte(deck.get(i));
            }
        }

        // Étape 5 : Boucle de jeu
        while (joueur1.getScore() + joueur2.getScore() < deck.size()) {
            Carte carte1 = joueur1.tirerCarte();
            Carte carte2 = joueur2.tirerCarte();
            System.out.println(joueur1 + " tire " + carte1 + " et " + joueur2 + " tire " + carte2);

            int comparaison = carte1.compare(carte2);
            if (comparaison > 0) {
                joueur1.gagnerPoint();
                System.out.println(joueur1 + " remporte ce tour.");
            } else if (comparaison < 0) {
                joueur2.gagnerPoint();
                System.out.println(joueur2 + " remporte ce tour.");
            } else {
                System.out.println("Égalité, personne ne gagne ce tour.");
            }
        }

        // Étape 6 : Afficher le vainqueur
        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println("Le vainqueur est " + joueur1 + " !");
        } else if (joueur2.getScore() > joueur1.getScore()) {
            System.out.println("Le vainqueur est " + joueur2 + " !");
        } else {
            System.out.println("La partie est un match nul !");
        }
    }
}