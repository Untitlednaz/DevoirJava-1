import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Carte> paquet;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.paquet = new ArrayList<>();
        this.score = 0;
    }

    public void ajouterCarte(Carte carte) {
        this.paquet.add(carte);
    }

    public Carte tirerCarte() {
        return this.paquet.remove(0);
    }

    public void gagnerPoint() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return nom + " a " + score + " points.";
    }
}