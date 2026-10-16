package TP1;

public class Chat extends Animal{
    private String couleur;

    public Chat(String nom, int age, double poids, String couleur) {
        super(nom,age,poids);
        this.couleur = couleur;
    }
    
    @Override 
    public void parler() {
        System.out.println("Miaou!");
    }
    
}
