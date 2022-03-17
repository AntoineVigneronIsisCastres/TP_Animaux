package animaux;

import java.util.Random;

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
            return "Je mange de l'herbe ("+this.getNom()+" "+this.toString()+" "+this.getSexe()+")\n";
        } else {
            return "Je mange de la viande ("+this.getNom()+" "+this.toString()+" "+this.getSexe()+")\n";
        }
    }

    public String dormir(){
        return "Je dors dans la savane ("+this.getNom()+" "+this.toString()+" "+this.getSexe()+")\n";
    }

    public void rencontrer(Animal animal, Savane savane) {
        Random rand = new Random();
        if (this.toString() == "LION" && animal.toString() == "LION") {
            if (this.getSexe() == animal.getSexe()) {
                float f = rand.nextFloat();
                if (f < 0.7) {
                    System.out.println("Deux lions de même sexe sont tous les deux morts lors d'un affrontement (RIP "+this.getNom()+" et "+animal.getNom()+")");
                    savane.getAnimaux().remove(this);
                    savane.getAnimaux().remove(animal);
                } else {
                    String s;
                    s = "Deux lions de même sexe se sont battus, ";
                    if (rand.nextBoolean()) {
                        System.out.println(s+this.getNom()+" est mort dans l'affrontement");
                        savane.getAnimaux().remove(this);
                    } else {
                        System.out.println(s+animal.getNom()+" est mort dans l'affrontement");
                        savane.getAnimaux().remove(animal);
                    }
                }
            } else {
                System.out.println("Deux lions de sexes différents ("+this.getNom()+" et "+animal.getNom()+"), ont eu un enfant nommé "+this.getNom()+animal.getNom());
                Lion alex = new Lion(this.getNom()+animal.getNom(), rand.nextBoolean() ? "M" : "F");
                savane.getAnimaux().add(alex);
            }
        } else if (this.toString() == "ZEBRE" && animal.toString() == "ZEBRE") {
            if (this.getSexe() != animal.getSexe()) {
                System.out.println("Deux zèbres de sexes différents ("+this.getNom()+" et "+animal.getNom()+"), ont eu un enfant nommé "+this.getNom()+animal.getNom());
                Zebre marty = new Zebre(this.getNom()+animal.getNom(), rand.nextBoolean() ? "M" : "F");
                savane.getAnimaux().add(marty);
            }
        } else if(this.toString() != animal.toString()){
            if(this.toString() == "LION") {
                System.out.println("Le lion nommé "+this.getNom()+" a mangé le zèbre nommé "+animal.getNom());
                savane.getAnimaux().remove(animal);
            } else {
                System.out.println("Le lion nommé "+animal.getNom()+" a mangé le zèbre nommé "+this.getNom());
                savane.getAnimaux().remove(this);
            }
        }
    }
}
