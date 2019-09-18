package defaultpackage;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] emp = new int[5];
        double[] emppay = new double[5];
        double[] ext = new double[5];
        double[] nom = new double[5];
        double total,regtotal,overtotal;
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter hours of emplyee " + (i + 1) + ":");
                emp[i] = s.nextInt();
                if (emp[i] >= 1 && emp[i] <= 70) {
                    break;
                }

            }
        }

        for (int i = 0; i < 5; i++) {
            if (emp[i] <= 40) {
                nom[i] = (double) emp[i] * 15;
                emppay[i] = ext[i] + nom[i];

            } else {
                emp[i] -= 40;
                ext[i] = (double) (emp[i] * 22.50);
                nom[i] = 600;
                emppay[i] = ext[i] + nom[i];

            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.format("Regualar Pay for employee " + (i + 1) + ": $ %.2f ", nom[i]);
            System.out.println("");
            System.out.format("Overtime pay for employee " + (i + 1) + ": $ %.2f ", ext[i]);
            System.out.println("");
            System.out.format("Total pay for employee " + (i + 1) + ": $ %.2f ", emppay[i]);
            System.out.println("");
            System.out.println("\n============================\n");
        }

        total = emppay[0] + emppay[1] + emppay[2] + emppay[3] + emppay[4];
        regtotal = nom[0] + nom[1] + nom[2] + nom[3] + nom[4];
        overtotal = ext[0] + ext[1] + ext[2] + ext[3] + ext[4];
        System.out.format("Total pay: $ %.2f", total);
        System.out.println("");
        System.out.format("Total regualor pay: $ %.2f", regtotal);
        System.out.println("");
        System.out.format("Total overtime pay: $ %.2f", overtotal);
    }
}
