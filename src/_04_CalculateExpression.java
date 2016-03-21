import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        double f1Basis = (a*a + b*b)/(a*a - b*b);
        double f1Degree = (a + b + c)/ Math.sqrt(c);
        double f2Basis = (a*a + b*b - c*c*c);
        double f2Degree = a-b;
        double f1 = Math.pow(f1Basis,f1Degree);
        double f2 = Math.pow(f2Basis,f2Degree);
        double averageABC = (a + b + c)/3;
        double averageF1F2 = (f1 + f2)/2;
        double diff = Math.abs(averageABC - averageF1F2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,diff);
    }
}
