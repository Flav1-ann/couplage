package eu.ensup.beansXml.dao;

import eu.ensup.beansXml.domaine.Musique;

import java.util.List;
import java.util.Set;

public interface IDao {

    Musique getMusiqueById(int id);
    void createMusique(Musique musique);
    Musique updateMusique(Musique musique);
    void deleteMusique(Musique musique);
    List<Musique> getAllMusique();

}
