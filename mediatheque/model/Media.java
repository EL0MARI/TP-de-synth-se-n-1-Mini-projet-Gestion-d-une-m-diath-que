package mediatheque.model;

abstract class Media implements Affichable {
    private String titre;
    private int annee;
    private boolean disponible = true;
    public Media(String titre, int annee){
        this.titre = titre;
        this.annee  = annee;
    }
    
    public int getAnnee() {
        return annee;
    }
    public String getTitre() {
        return titre;
    }
    public boolean estDisponible(){
        if(disponible)
            return true;
        else 
            return false;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    public abstract void afficherInfos();


}