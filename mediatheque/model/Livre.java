package mediatheque.model;
import java.util.*;
public class Livre extends Media implements Empruntable{
    
    private String auteur;
    private int nombreDePages;
    private Utilisateur emprunteur = null;
    public Livre(String titre,int annee, String auteur, int nombreDePages){
        super(titre, annee);
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }

    @Override
    public void afficherInfos(){
        System.out.println("titre :"+getTitre());
        System.out.println("auteur : "+auteur);
        System.out.println("annee : "+getAnnee());
        System.out.println(" nombre de pages : "+nombreDePages);
        if(estDisponible())
            System.out.println("disponible");
        else 
            System.out.println("emprunté");

    }
    @Override
    public void emprunter(Utilisateur u){
        if(u == null)
            throw new IllegalArgumentException("utilisateur invalide !");
        if(!estDisponible()){
            throw new IllegalArgumentException("n'est pas disponible ");
        }
        this.emprunteur = u;
        setDisponible(false);
    }

    @Override
    public boolean estEmprunte() {
        return !estDisponible()|| emprunteur != null;
    }
    @Override
    public void retourner(){
        if(emprunteur == null)
            throw new IllegalArgumentException("Ce média n'a pas ete emprunté");
        this.emprunteur = null;
        setDisponible(true);
    }
    
}
