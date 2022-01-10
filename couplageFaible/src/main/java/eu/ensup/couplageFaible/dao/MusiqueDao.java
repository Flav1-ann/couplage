package eu.ensup.couplageFaible.dao;

import eu.ensup.couplageFaible.domaine.Musique;

import java.util.Set;

public class MusiqueDao implements IDao{

    @Override
    public Musique getMusiqueById(int id) {
        if(id == 1){
            return new Musique(1,"Maxime chambroncel","moi","toi");
        }
        return null;
    }

    @Override
    public void createMusique(Musique musique) {
        System.out.println("Musique créée: "+musique.toString());
    }

    @Override
    public Musique updateMusique(Musique musique) {
        System.out.println("Musique modifiée: "+musique.toString());
        return musique;
    }

    @Override
    public void deleteMusique(Musique musique) {
        System.out.println("Compte supprimée: "+musique.toString());
    }

    @Override
    public Set<Musique> getAllMusique() {
        System.out.println("Récupération de toutes les ziks");
        return null;
    }
}
