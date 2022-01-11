package eu.ensup.BeansConnectAutowire.launcher;

import eu.ensup.BeansConnectAutowire.services.MusiqueService;
import eu.ensup.BeansConnectAutowire.domaine.Musique;
import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) throws BeansException {

        //1. Chargement
        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) new ClassPathXmlApplicationContext(
                "prod-beans.xml");

        //2. Récupération
        MusiqueService musiqueService = (MusiqueService) applicationContext.getBean("musiqueService");

        //3. Manipulation
        Musique maZikMu = new Musique(5, "Moi", "Flavien", "Le temps des tempêtes");

        musiqueService.enregistrerMusique(maZikMu);

        Musique musique = musiqueService.trouverMusique(1);
        if (musique != null) {
            System.out.println("la musique a été trouvé " + musique);
        } else {
            System.out.println("la musique n'as pas été trouvé");
        }

        applicationContext.close();

    }

}
