public class BmiService {
    public double index(double weight, double growth) {
        double resalt = weight / (growth * growth);
        return resalt;
    }
}
