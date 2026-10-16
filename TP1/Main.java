package TP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5, 10.0);
        animal.seDeplacer();
        animal.parler();
        animal.manger(2.0);
        System.out.println("Nom: " + animal.getNom());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Poids: " + animal.getPoids());

        Chien chien = new Chien("Rex", 3, 15.0, "Golden Retriever");
        Chat chat = new Chat("Mimi", 2, 5.0, "Orange");
        Oiseau oiseau = new Oiseau("Tweety", 1, 0.5, null);

        List<Animal> animaux = new ArrayList<>();
        animaux.add(chien);
        animaux.add(chat);
        animaux.add(oiseau);

        for (Animal a : animaux) {
            a.parler();
        }

        
    }
        
    public static void faireBougerLesAnimaux(List<Animal> animaux, double poidsMin) {
            
            for (Animal a : animaux) {
                if (poidsMin < a.getPoids()) {
                    a.seDeplacer();
                }
            }
        }
    
}
