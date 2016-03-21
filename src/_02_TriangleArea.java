import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double Ax = scn.nextDouble();
        double Ay = scn.nextDouble();
        double Bx = scn.nextDouble();
        double By = scn.nextDouble();
        double Cx = scn.nextDouble();
        double Cy = scn.nextDouble();

        double area =Math.abs((Ax*(By-Cy) + Bx*(Cy-Ay) + Cx*(Ay-By))/2);
        System.out.println(Math.round(area));
    }
}
