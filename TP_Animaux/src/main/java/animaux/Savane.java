package animaux;

import java.util.List;
import java.util.ArrayList;

public class Savane {

    private List<Animal> animaux = new ArrayList<Animal>();
    
    public Savane(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public List<Animal> getAnimaux() {
        return this.animaux;
    }

    public void mangerDansLaSavane() {
        for (Animal a : this.animaux) {
            a.manger();
        }
    }

    public void dormirDansLaSavane() {
        for (Animal a : this.animaux) {
            a.dormir();
        }
    }
}
