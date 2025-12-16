package mediatheque.ui;

import mediatheque.service.Mediatheque;

import mediatheque.model.*;

public class TestMediatheque {
       public static void main(String[] args){
            Mediatheque M = new Mediatheque(10);
            Livre livre1 = new Livre("Le Petit Prince", 1943, "Antoine de Saint-Exupéry", 96);
            Livre livre2 = new Livre("1984", 1949, "George Orwell", 328);
            Dvd dvd1 = new Dvd("Inception", 2010, "Christopher Nolan", 148);
            Dvd dvd2 = new Dvd("Interstellar", 2014, "Christopher Nolan", 169);
            M.ajouterMedia(livre1);
            M.ajouterMedia(livre2);
            M.ajouterMedia(dvd1);
            M.ajouterMedia(dvd2);
            M.afficherCatalogue();
            Utilisateur U1 = new Utilisateur("ali","ljalide",15);
            Utilisateur U2 = new Utilisateur("med","el omari",18);
            Affichable[] affichables = new Affichable[6];

            affichables[0] = livre1;
            affichables[1] = livre2;
            affichables[2] = dvd1;
            affichables[3] = dvd2;
            affichables[4] = U1;
            affichables[5] = U2;
            
            if (livre1.estDisponible()) {
                livre1.emprunter(U1);  
                System.out.println("Livre 'Le Petit Prince' emprunté avec succes.");
            } else {
                System.out.println("Le livre 'Le Petit Prince' est déja emprunté.");
            }

            if (livre2.estDisponible()) {
                livre2.emprunter(U2);
                System.out.println("Livre '1984' emprunté avec succes.");
            } else {
                System.out.println("Le livre '1984' est déja emprunté.");
            }
            
            if (dvd1.estDisponible()) {
                dvd1.emprunter(U2);  
                System.out.println("DVD 'Inception' emprunté avec succes.");
            } else {
                System.out.println("Le DVD 'Inception' est déja emprunté.");
            }

            if (dvd2.estDisponible()) {
                dvd2.emprunter(U1);
                System.out.println("DVD 'Interstellar' emprunté avec succes.");
            } else {
                System.out.println("Le DVD 'Interstellar' est déja emprunté.");
            }
            System.out.println("\nVérification après emprunt:");
            System.out.println("Livre 1 emprunté: " + livre1.estEmprunte());
            System.out.println("DVD 1 emprunté: " + dvd1.estEmprunte());
             System.out.println("\nTentative d'emprunter un livre déjà emprunté:");
            try {
                livre1.emprunter(U2); 
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("\nRetour des médias:");
            livre1.retourner();   
            dvd1.retourner();
            System.out.println("\nÉtat après retour:");
            M.afficherCatalogue();

       }
}
