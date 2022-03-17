package animaux;

public class Lion extends Animal {

    private String nom;
    private String sexe;
    private Nourriture nourriture;
    
    public Lion(String nom, String sexe){
        super(nom, sexe, Nourriture.Carnivore);
    }

    @Override
    public String toString() {
        return "LION";
    }
}
