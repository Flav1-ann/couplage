package eu.ensup.beansXml.services;

import eu.ensup.beansXml.dao.IDao;
import eu.ensup.beansXml.domaine.Musique;

import java.util.List;
import java.util.Set;

public class MusiqueService {

    private IDao iDao;

    public MusiqueService() {
    }

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

    public List<Musique> recuperationToutesMusiques(){
        return iDao.getAllMusique();
    }

    public IDao getiDao() {
        return iDao;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }

    private void initialisation() {
        System.out.println("SERVICE : INIT avec la " + iDao.getClass());
    }

    private void destruction() {
        System.out.println("SERVICE : DESTRUCT avec la " + iDao.getClass());
    }
}
