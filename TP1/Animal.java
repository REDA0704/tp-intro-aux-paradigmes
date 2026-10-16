package TP1;

public class Animal {

    public Animal() {};

    public Animal(String nom, int age, double poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
    }

    private String nom;
    private int age;
    private double poids;

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getPoids() {
        return poids;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void seDeplacer() {
        System.out.println("L'animal se déplace.");
    }

    public void parler() {
        System.out.println("...");
    }

    public void manger(double quantite) {
        poids += quantite;
    }

}
