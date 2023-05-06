public class BmiService {
    public double calculate(double weight_kg, double hight_metrs) {
        double result;
        result = weight_kg / (hight_metrs*hight_metrs);
        return result;

    }

}
