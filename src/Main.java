
public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        double indexMass= calculate.index(98, 1.87);
        System.out.println ((int)indexMass);

    }
}
