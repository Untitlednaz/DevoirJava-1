public class Carte {

    public static String[] COULEURS = {"Coeur", "Trèfle", "Pic", "Carreau"};
    public static String[] VALEURS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
    
    private String couleur;
    private int valeur;

    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public int compare(Carte c) {
        return Integer.compare(this.valeur, c.valeur);
    }

    @Override
    public String toString() {
        return VALEURS[valeur] + " de " + couleur;
    }
}