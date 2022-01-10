package eu.ensup.couplageFaible.services;

import eu.ensup.couplageFaible.dao.IDao;
import eu.ensup.couplageFaible.domaine.Musique;

import java.util.Set;

public class MusiqueService {

    private IDao iDao;

    public MusiqueService(IDao iDao){
        this.iDao = iDao;
    }

    public Musique trouverMusique(int id){
        return iDao.getMusiqueById(id);
    }

    public void enregistrerMusique(Musique musique){
        iDao.createMusique(musique);
    }

    public Musique miseAJourMusique(Musique musique){
        return iDao.updateMusique(musique);
    }

    public void suppressionMusique(Musique musique){
        iDao.deleteMusique(musique);
    }

    public Set<Musique> recuperationToutesMusiques(){
        return iDao.getAllMusique();
    }


}
