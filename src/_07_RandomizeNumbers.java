import java.util.Random;
import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _07_RandomizeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt();
        int secondNumber = scn.nextInt();

        int min = Math.min(firstNumber,secondNumber);
        int max = Math.max(firstNumber,secondNumber);
        Random rndGenerator = new Random();

        for (int i = min; i <= max ; i++) {
            int rndNumber = rndGenerator.nextInt((max-min)+1)+min;
            System.out.println(rndNumber + " ");
        }

    }
}
