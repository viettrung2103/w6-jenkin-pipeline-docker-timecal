import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance");
        double s = sc.nextDouble();
        System.out.println("Enter the velocity");
        double v = sc.nextDouble();
        System.out.println("Time need: " + timeCalculator(s,v));
    }

    public static double timeCalculator(double s, double v) {
        if (v == 0) {
            return 0;
        }
        return s / v;
    }

}
