import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _05_DecimalToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        String base7 = Integer.toString(decimal,7);

        System.out.println(base7);

    }
}
