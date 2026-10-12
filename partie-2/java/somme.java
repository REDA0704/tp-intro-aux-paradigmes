public class somme {

    public int Somme(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        somme calc = new somme();
        System.out.println("Somme : " + calc.Somme(5));
    }
}