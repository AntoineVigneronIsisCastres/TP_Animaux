package animaux;

import java.util.ArrayList;
import java.util.List;

public class TestSavane {

    public static void main(String args[]) {
        ArrayList<Animal> liste = new ArrayList<Animal>();
        Savane savane1 = new Savane(liste);

        Zebre marty1 = new Zebre("Marty1","M");
        Zebre marty2 = new Zebre("Marty2","M");
        Zebre marty3 = new Zebre("Marty3","F");
        Zebre marty4 = new Zebre("Marty4","M");
        Zebre marty5 = new Zebre("Marty5","M");
        Zebre marty6 = new Zebre("Marty6","F");
        Zebre marty7 = new Zebre("Marty7","F");
        Zebre marty8 = new Zebre("Marty8","M");
        Zebre marty9 = new Zebre("Marty9","F");
        Zebre marty10 = new Zebre("Marty10","F");

        Lion alex1 = new Lion("Alex1","M");
        Lion alex2 = new Lion("Alex2","M");
        Lion alex3 = new Lion("Alex3","M");
        Lion alex4 = new Lion("Alex4","M");
        Lion alex5 = new Lion("Alex5","M");
        Lion alex6 = new Lion("Alex6","M");
        Lion alex7 = new Lion("Alex7","M");
        Lion alex8 = new Lion("Alex8","M");
        Lion alex9 = new Lion("Alex9","M");
        Lion alex10 = new Lion("Alex10","M");
    }
    
}
