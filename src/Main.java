
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double kilos = 98;
        double meters = 1.87;

        int index = service.calculate(kilos, meters);
        System.out.println(index);
    }
}