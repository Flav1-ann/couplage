package eu.ensup.couplageFaible.domaine;

public class Musique {
    private int id;
    private String auteur;
    private String producteur;
    private String titre;

    public Musique(int id, String auteur, String producteur, String titre) {
        this.id = id;
        this.auteur = auteur;
        this.producteur = producteur;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getProducteur() {
        return producteur;
    }

    public void setProducteur(String producteur) {
        this.producteur = producteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Musique{" +
                "id=" + id +
                ", auteur='" + auteur + '\'' +
                ", producteur='" + producteur + '\'' +
                ", studio='" + titre + '\'' +
                '}';
    }
}
