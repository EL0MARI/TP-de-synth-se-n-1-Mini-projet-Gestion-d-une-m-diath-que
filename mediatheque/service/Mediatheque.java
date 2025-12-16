package mediatheque.service;
import mediatheque.model.*;

import java.util.ArrayList;
import java.util.*;

public class Mediatheque {
    
    private Media[] medias;
    private int nbMedias;

    public Mediatheque(int capacite){
        medias = new Media[capacite];
        nbMedias = 0;
    }
    public void ajouterMedia(Media m){
        if(nbMedias < medias.length)
            medias[nbMedias++] = m;
        else
            System.out.println("La médiathèque est pleine");
    }
    public void afficherCatalogue(){
        for(int i =0;i<nbMedias;i++){
            if(medias[i] != null)
                medias[i].afficherInfos();
        }
    }
    public Media chercherParTitre(String titre){
        for(int i =0;i<nbMedias;i++){
            
            if(medias[i].getTitre().equals(titre)){
                return medias[i];
            }
            
        }
        return null;
    }
    
}
