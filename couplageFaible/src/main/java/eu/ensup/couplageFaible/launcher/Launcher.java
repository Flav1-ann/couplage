package eu.ensup.couplageFaible.launcher;

import eu.ensup.couplageFaible.dao.IDao;
import eu.ensup.couplageFaible.dao.MusiqueDao;
import eu.ensup.couplageFaible.dao.MusiqueDaoAlt;
import eu.ensup.couplageFaible.domaine.Musique;
import eu.ensup.couplageFaible.services.MusiqueService;

public class Launcher {

    public static void main(String[] args) {
        Musique maZikMu = new Musique(5,"Moi","Flavien","Le temps des tempêtes");
        IDao idao = new MusiqueDao();
        IDao idaoAlt = new MusiqueDaoAlt();
        MusiqueService musiqueService = new MusiqueService(idaoAlt);

        musiqueService.enregistrerMusique(maZikMu);

        Musique musique = musiqueService.trouverMusique(1);
        if(musique != null){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }

}
