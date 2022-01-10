package eu.ensup.couplageFort.services;

import eu.ensup.couplageFort.dao.MusiqueDao;
import eu.ensup.couplageFort.domaine.Musique;

import java.util.List;

public class MusiqueService {
    private eu.ensup.couplageFort.dao.MusiqueDao MusiqueDao;

    public MusiqueService() {
        super();
        this.MusiqueDao = new MusiqueDao();
    }

    public Musique recuperationMusique(int id) {
        System.out.println("SERVICE: récupération du Musique id=" + id);

        Musique MusiqueRetour = MusiqueDao.getMusiqueById(id);
        return MusiqueRetour;
    }

    public void creerMusique(Musique Musique) {
        System.out.println("SERVICE: création du Musique " + Musique.toString());

        MusiqueDao.createMusique(Musique);
    }

    public Musique mettreAJourMusique(Musique Musique) {
        System.out.println("SERVICE: mise à jour du Musique " + Musique.toString());

        Musique MusiqueRetour = MusiqueDao.updateMusique(Musique);
        return MusiqueRetour;
    }

    public void supprimerMusique(Musique Musique) {
        System.out.println("SERVICE: suppression du Musique " + Musique.toString());

        MusiqueDao.deleteMusique(Musique);
    }

    public List<Musique> recuperationMusiqueListe() {
        System.out.println("SERVICE: récupération de tous les Musiques");

        List<Musique> MusiqueListeRetour = MusiqueDao.getAllMusique();
        return MusiqueListeRetour;
    }

    public void comparaisonMusique(Musique Musique1, Musique Musique2) {
        System.out.println("SERVICE: comparaison entre deux Musiques");
    }
}
