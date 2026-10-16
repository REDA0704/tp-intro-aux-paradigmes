package TP1;

public class Oiseau extends Animal{
    private Double envergure;
    
    public Oiseau(String nom, int age, double poids, Double envergure) {
        super(nom, age, poids);
        this.envergure = envergure;
    }
    
    @Override 
    public void seDeplacer() {
        System.out.println("L'oiseau vole.");
    }
}
