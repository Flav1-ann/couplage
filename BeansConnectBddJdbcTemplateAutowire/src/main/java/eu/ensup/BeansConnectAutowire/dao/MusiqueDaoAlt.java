package eu.ensup.BeansConnectAutowire.dao;

import eu.ensup.BeansConnectAutowire.domaine.Musique;

import java.util.List;

public class MusiqueDaoAlt  implements IDao{

    @Override
    public Musique getMusiqueById(int id) {
        if(id == 1){
            return new Musique(1,"Maxime chambroncel","moi","toi");
        }
        return null;
    }

    @Override
    public void createMusique(Musique musique) {
        System.out.println("Musique créée Alt: "+musique.toString());
    }

    @Override
    public Musique updateMusique(Musique musique) {
        System.out.println("Musique modifiée Alt: "+musique.toString());
        return musique;
    }

    @Override
    public void deleteMusique(Musique musique) {
        System.out.println("Compte supprimée Alt: "+musique.toString());
    }

    @Override
    public List<Musique> getAllMusique() {
        System.out.println("Récupération de toutes les ziks Alt");
        return null;
    }

    private void initialisation() {
        System.out.println("DAO ALT : INIT");
    }

    private void destruction() {
        System.out.println("DAO ALT : DESTRUCT");
    }
}
