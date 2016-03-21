import java.util.Scanner;

/**
 * Created by galeto on 17.03.16.
 */
public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        String aToHex = Integer.toHexString(a).toUpperCase();
        String aToBin = String.format("%10s",Integer.toBinaryString(a)).replace(' ','0');

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",aToHex,aToBin,b,c);

    }
}
