public class BmiService {
    public double calculate(double weightkg, double hightMetrs) {
        double result;
        result = weightkg / (hightMetrs*hightMetrs);
        return result;

    }

}
