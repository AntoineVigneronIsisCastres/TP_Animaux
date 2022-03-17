package animaux;

import java.util.ArrayList;
import java.util.Random;

public class TestSavane {

    public static void main(String args[]) {
        ArrayList<Animal> liste = new ArrayList<Animal>();
        Savane savane1 = new Savane(liste);

        Random rand = new Random();
        for(int i = 1; i <= 50; i++) {
            if (rand.nextBoolean()){
                Zebre marty1 = new Zebre("Marty"+i, rand.nextBoolean() ? "M" : "F");
                savane1.getAnimaux().add(marty1);
            } else {
                Lion alex1 = new Lion("Alex"+i, rand.nextBoolean() ? "M" : "F");
                savane1.getAnimaux().add(alex1);
            }
        }

        int i = 50;
        int nbjours = 0;
        while(i>0 && i<=51) {
            
            nbjours++;
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Jour "+nbjours);
            if(i == 1) {
                System.out.println("Il ne reste plus que "+savane1.getAnimaux().get(0).getNom()+" dans la savane, quel monde impitoyable...");
                break;
            }
            System.out.println(i+" animaux cohabitent dans la savane");
            Animal animalchoisi1 = savane1.getAnimaux().get(rand.nextInt(i));
            int randomindex = rand.nextInt(i);
            // Dans le cas où l'index aléatoire choisi pour un animal est égal à 0, lors de la soustraction
            // de la taille de la savane moins l'index, on obtient la taille de la savane, entrainant
            // une out of bounds exception, j'ai choisi de mettre randomindex aléatoirement pour éviter
            // de regénérer un index aléatoire égal à 0
            if(randomindex == 0) {
                randomindex = 1;
            }
            Animal animalchoisi2 = savane1.getAnimaux().get(randomindex != savane1.getAnimaux().indexOf(animalchoisi1) ? randomindex : i-randomindex);
            animalchoisi1.rencontrer(animalchoisi2, savane1); 
            int nbanimauxrestants = 0;
            for(Animal a : savane1.getAnimaux()) {
                nbanimauxrestants += 1;
            }
            i = nbanimauxrestants;
       }
    }
    
}
