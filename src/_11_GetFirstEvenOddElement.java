import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by galeto on 18.03.16.
 */
public class _11_GetFirstEvenOddElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] inputNumbers = scn.nextLine().split(" ");
        String[] command = scn.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        ArrayList<Integer> resultNumbers = firstEvenOddNumbers(numbers,command);
        resultNumbers.forEach(n -> System.out.print(n + " "));

    }
    private static ArrayList<Integer> firstEvenOddNumbers(int[] numbers,String[] command){
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < numbers.length && numList.size() < Integer.parseInt(command[1]); i++) {
            if(numbers[i] % 2 == 0 && command[2].equals("even")){
                numList.add(numbers[i]);
            } else if(numbers[i] % 2 != 0 && command[2].equals("odd")){
                numList.add(numbers[i]);
            }
        }
        return numList;
    }
}
