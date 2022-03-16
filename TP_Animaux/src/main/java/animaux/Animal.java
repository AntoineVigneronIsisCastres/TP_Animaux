package animaux;

public class Animal {
    
    private String nom;
    private String sexe;
    private Nourriture nourriture;

    public Animal(String nom, String sexe, Nourriture nourriture) {
        this.nom = nom;
        this.sexe = sexe;
        this.nourriture = nourriture;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Nourriture getNourriture() {
        return this.nourriture;
    }

    public void setNourriture(Nourriture nourriture) {
        this.nourriture = nourriture;
    }

    public String manger(){
        if (this.nourriture == Nourriture.Herbivore) {
            return "Je mange de l'herbe ("+this.getNom()+" "+this.getClass()+" "+this.getSexe()+")\n";
        } else {
            return "Je mange de la viande ("+this.getNom()+" "+this.getClass()+" "+this.getSexe()+")\n";
        }
    }

    public String dormir(){
        return "Je dors dans la savane ("+this.getNom()+" "+this.getClass()+" "+this.getSexe()+")\n";
    }
}
