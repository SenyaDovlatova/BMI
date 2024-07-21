public class BmiService {
    public int calculate(double kilos, double meters) {

        double index = kilos / (meters * meters);

        return (int) index;
    }
}
