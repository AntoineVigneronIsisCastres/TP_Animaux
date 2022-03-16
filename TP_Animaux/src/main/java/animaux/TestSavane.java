package animaux;

import java.util.ArrayList;
import java.util.List;

public class TestSavane {

    public static void main(String args[]) {
        ArrayList<Animal> liste = new ArrayList<Animal>();
        Savane savane1 = new Savane(liste);

        Zebre marty1 = new Zebre("Marty1","M");
        savane1.getAnimaux().add(marty1);
        Zebre marty2 = new Zebre("Marty2","M");
        savane1.getAnimaux().add(marty2);
        Zebre marty3 = new Zebre("Marty3","F");
        savane1.getAnimaux().add(marty3);
        Zebre marty4 = new Zebre("Marty4","M");
        savane1.getAnimaux().add(marty4);
        Zebre marty5 = new Zebre("Marty5","M");
        savane1.getAnimaux().add(marty5);
        Zebre marty6 = new Zebre("Marty6","F");
        savane1.getAnimaux().add(marty6);
        Zebre marty7 = new Zebre("Marty7","F");
        savane1.getAnimaux().add(marty7);
        Zebre marty8 = new Zebre("Marty8","M");
        savane1.getAnimaux().add(marty8);
        Zebre marty9 = new Zebre("Marty9","F");
        savane1.getAnimaux().add(marty9);
        Zebre marty10 = new Zebre("Marty10","F");
        savane1.getAnimaux().add(marty10);

        Lion alex1 = new Lion("Alex1","M");
        savane1.getAnimaux().add(alex1);
        Lion alex2 = new Lion("Alex2","M");
        savane1.getAnimaux().add(alex2);
        Lion alex3 = new Lion("Alex3","M");
        savane1.getAnimaux().add(alex3);
        Lion alex4 = new Lion("Alex4","M");
        savane1.getAnimaux().add(alex4);
        Lion alex5 = new Lion("Alex5","M");
        savane1.getAnimaux().add(alex5);
        Lion alex6 = new Lion("Alex6","M");
        savane1.getAnimaux().add(alex6);
        Lion alex7 = new Lion("Alex7","M");
        savane1.getAnimaux().add(alex7);
        Lion alex8 = new Lion("Alex8","M");
        savane1.getAnimaux().add(alex8);
        Lion alex9 = new Lion("Alex9","M");
        savane1.getAnimaux().add(alex9);
        Lion alex10 = new Lion("Alex10","M");
        savane1.getAnimaux().add(alex10);

        savane1.mangerDansLaSavane();
        savane1.dormirDansLaSavane();
    }
    
}
