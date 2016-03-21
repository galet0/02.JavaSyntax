import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _06_Base7ToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String  base7 = scn.next();
        int decimal = Integer.valueOf(base7,7);
        System.out.println(decimal);
    }
}
