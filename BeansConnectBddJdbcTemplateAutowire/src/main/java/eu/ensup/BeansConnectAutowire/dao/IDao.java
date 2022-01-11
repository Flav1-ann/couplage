package eu.ensup.BeansConnectAutowire.dao;

import eu.ensup.BeansConnectAutowire.domaine.Musique;

import java.util.List;

public interface IDao {

    Musique getMusiqueById(int id);
    void createMusique(Musique musique);
    Musique updateMusique(Musique musique);
    void deleteMusique(Musique musique);
    List<Musique> getAllMusique();

}
