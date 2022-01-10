package dao;

import domaine.Musique;

import java.util.List;

public class MusiqueDao {

    public Musique getMusiqueById(int id) {
        System.out.println("DAO: récupération de la Musique id=" + id);

        if (id == 3) {
            return new Musique(3, "Queen", "Queen", "we are the champions");
        }
        return null;
    }

    public void createMusique(Musique Musique) {
        System.out.println("DAO: création de la Musique " + Musique.toString());
    }

    public Musique updateMusique(Musique Musique) {
        System.out.println("DAO: mise à jour de la Musique " + Musique.toString());
        return null;
    }

    public void deleteMusique(Musique Musique) {
        System.out.println("DAO: suppression de la  Musique " + Musique.toString());
    }

    public List<Musique> getAllMusique() {
        System.out.println("DAO: récupération de tous les Musiques");
        return null;
    }
}
