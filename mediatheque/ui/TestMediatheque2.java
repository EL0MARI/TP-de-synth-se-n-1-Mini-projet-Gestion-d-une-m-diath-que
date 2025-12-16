package mediatheque.ui;

import mediatheque.model.*;
import mediatheque.service.Mediatheque;

public class TestMediatheque2 {
    public static void main(String[] args) {
        
        Mediatheque M = new Mediatheque(10);

        Livre livre1 = new Livre("Le Petit Prince", 1943, "Antoine de Saint-Exupéry", 96);
        Livre livre2 = new Livre("1984", 1949, "George Orwell", 328);
        Dvd dvd1 = new Dvd("Inception", 2010, "Christopher Nolan", 148);
        Dvd dvd2 = new Dvd("Interstellar", 2014, "Christopher Nolan", 169);

        M.ajouterMedia(livre1);
        M.ajouterMedia(livre2);
        M.ajouterMedia(dvd1);
        M.ajouterMedia(dvd2);

        Utilisateur U1 = new Utilisateur("Ali", "Ljalide", 15);
        Utilisateur U2 = new Utilisateur("Med", "El Omari", 18);

        
        Affichable[] affichables = new Affichable[6];
        affichables[0] = livre1;
        affichables[1] = livre2;
        affichables[2] = dvd1;
        affichables[3] = dvd2;
        affichables[4] = U1;
        affichables[5] = U2;

        
        Afficheur.afficherTout(affichables);
    }
}
