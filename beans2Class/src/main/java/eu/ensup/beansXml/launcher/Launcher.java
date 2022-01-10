package eu.ensup.beansXml.launcher;

import eu.ensup.beansXml.container.ServiceBeansConfig;
import eu.ensup.beansXml.domaine.Musique;
import eu.ensup.beansXml.services.MusiqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        //1. Chargement
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ServiceBeansConfig.class);

        //2. Récupération
        MusiqueService musiqueService = (MusiqueService) applicationContext.getBean("musiqueService");

        //3. Manipulation
        Musique maZikMu = new Musique(5, "Moi", "Flavien", "Le temps des tempêtes");

        musiqueService.enregistrerMusique(maZikMu);

        Musique musique = musiqueService.trouverMusique(1);
        if (musique != null) {
            System.out.println("la musique a été trouvé");
        } else {
            System.out.println("la musique n'as pas été trouvé");
        }


    }

}
