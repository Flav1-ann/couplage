package launcher;

import domaine.Musique;
import services.MusiqueService;

import java.util.Scanner;

public class launcher {
    public static void main(String[] args) {

        MusiqueService serviceMusique = new MusiqueService();
        serviceMusique.creerMusique(new Musique(1,"James Pierpont","Edison Records","Jingle Bells"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une musique à récuperer");
        String input = sc.nextLine();
        int idMusique = -1;
        idMusique =  Integer.parseInt(input);

        if (idMusique != -1){
            Musique musiqueload = serviceMusique.recuperationMusique(Integer.parseInt(input));

            if (musiqueload != null){
                System.out.println("la musique "+ musiqueload.getTitre()+" est chargée.");
            }else {
                System.out.println("Aucune musique n'as été trouvée");
            }
        }else {
            System.out.println("le type de l'input n'est pas un numéro");
        }

    }
}
