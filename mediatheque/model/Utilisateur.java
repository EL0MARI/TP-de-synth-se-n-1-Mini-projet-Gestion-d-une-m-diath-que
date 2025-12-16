package mediatheque.model;

public class Utilisateur implements Affichable{
    private String nom;
    private String prenom;
    private int age;
    public Utilisateur(String nom,String prenom,int age){
        this.nom=nom;
        this.age=age;
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPreom(String prenom){
        this.prenom = prenom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getIdentite(){
        return " "+prenom+" "+nom+" ";
    }
    public void afficherInfos(){
        System.out.println("le nom : "+nom);
        System.out.println("le prenom : "+prenom);
        System.out.println("l'age : "+age);
    }
}
