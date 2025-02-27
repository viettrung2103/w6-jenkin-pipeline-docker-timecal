public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time need: " + timeCalculator(100.0, 100.));
    }

    public static double timeCalculator(double s, double v) {
        if (v == 0) {
            return 0;
        }
        return s / v;
    }

}
