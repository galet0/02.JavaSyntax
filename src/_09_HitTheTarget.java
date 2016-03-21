import java.util.Scanner;

/**
 * Created by galeto on 18.03.16.
 */
public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20; j++) {
                if(i + j == target){
                    System.out.printf("%d + %d = %d\n",i,j,target);
                } if(i - j == target) {
                    System.out.printf("%d - %d = %d\n",i,j,target);
                }
            }
        }
    }
}
