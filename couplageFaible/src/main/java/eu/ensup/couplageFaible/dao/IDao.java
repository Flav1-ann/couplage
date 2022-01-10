package eu.ensup.couplageFaible.dao;

import eu.ensup.couplageFaible.domaine.Musique;

import java.util.Set;

public interface IDao {

    Musique getMusiqueById(int id);
    void createMusique(Musique musique);
    Musique updateMusique(Musique musique);
    void deleteMusique(Musique musique);
    Set<Musique> getAllMusique();

}
