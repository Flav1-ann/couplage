package eu.ensup.BeansConnectAutowire.services;

import eu.ensup.BeansConnectAutowire.dao.IDao;
import eu.ensup.BeansConnectAutowire.domaine.Musique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class MusiqueService {

    @Autowired
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

    @PostConstruct
    private void initialisation() {
        System.out.println("SERVICE : INIT avec la " + iDao.getClass());
    }

    @PreDestroy
    private void destruction() {
        System.out.println("SERVICE : DESTRUCT avec la " + iDao.getClass());
    }
}
