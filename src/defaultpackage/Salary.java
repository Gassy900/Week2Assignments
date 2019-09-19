
package defaultpackage;

public class Salary {

    public static void main(String[] args) {
        double val = 40000,raise;
        double[] oldval = new double[10];
        System.out.println("YEAR\t OlD SALARY\t RAISE\t NEW SALARY");
        System.out.println("----\t ----------\t -----\t ----------");
        System.out.println("1\t --------\t 40000.00\t 40000.00");
        for (int i = 0; i < 9; i++) {
            oldval[i] = val;
            raise= val * .03;
            val = raise + val;
            System.out.format((i+2)+"\t %.2f\t %.2f\t %.2f",oldval[i],raise,val);
            System.out.println("");
            
        }
    }
    
}
