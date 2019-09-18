package defaultpackage;

import java.util.Scanner;

public class PowerChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int var;
        int[] ans = new int[10];
        while (true) {
            System.out.print("Enter a number from 1-10: ");
            var = s.nextInt();
            if (var >= 1 && var <= 10) {
                break;
            }
        }
        System.out.println("X\t 2^X");
        System.out.println("--\t ---");
        for (int i = 0; i < var; i++) {
            ans[var] = (int)(Math.pow(2,(i+1)));
            System.out.println((i+1)+"\t "+ ans[var]);
        }

    }

}
