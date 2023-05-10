public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double hightMetrs = 1.87;


        double index = service.calculate(weightKg, hightMetrs); // должно получиться 28
        System.out.println((int) index);
    }
}
