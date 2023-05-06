public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight_kg = 98;
        double hight_metrs = 1.87;


        double index = service.calculate(weight_kg, hight_metrs); // должно получиться 28
        System.out.println((int) index);
    }
}
