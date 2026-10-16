package TP1;

public class Chien extends Animal{
    private String race;

    public Chien(String nom, int age, double poids, String race) {
        super(nom, age, poids);
        this.race = race;
    }

    @Override
    public void parler() {
        System.out.println("Wouf!");
    }

    public void aboyer() {
        System.out.println("Wouaf Wouaf!");
    }

}
