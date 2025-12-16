package mediatheque.model;

public class Dvd extends Media implements Empruntable{
    private String realisateur;
    private int dureeMinutes;
    private Utilisateur emprunteur = null;
    public Dvd(String titre, int annee, String realisateur, int dureeMinutes){
        super(titre,annee);
        this.realisateur = realisateur;
        this.dureeMinutes=dureeMinutes;
    }
    @Override
    public void afficherInfos(){
        System.out.println("titre :"+getTitre());
        System.out.println("realisateur : "+realisateur);
        System.out.println("annee : "+getAnnee());
        System.out.println(" dureeMinutes : "+dureeMinutes+" min");
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
