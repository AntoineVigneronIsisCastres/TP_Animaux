package animaux;

public class Zebre extends Animal {

    private String nom;
    private String sexe;
    private Nourriture nourriture;
    
    public Zebre(String nom, String sexe){
        super(nom, sexe, Nourriture.Herbivore);
    }

    @Override
    public String toString() {
        return "ZEBRE";
    }
}
