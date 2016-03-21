import java.util.Scanner;

/**
 * Created by galeto on 18.03.16.
 */
public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] words = scn.nextLine().trim().split(" ");
        String firstString,secondString;
        if(words[0].length() > words[1].length()){
            firstString = words[0];
            secondString = words[1];
        } else {
            secondString = words[0];
            firstString = words[1];
        }
        long charSum = calculateCharSum(firstString,secondString);
        System.out.println(charSum);
    }
    private static long calculateCharSum(String firstWord,String secondWord){
        long charSum = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            if(i < secondWord.length()){
                charSum += (firstWord.charAt(i) * secondWord.charAt(i));
            } else {
                charSum += firstWord.charAt(i);
            }
        }
        return charSum;
    }
}
