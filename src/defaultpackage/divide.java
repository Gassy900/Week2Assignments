
package defaultpackage;

import java.util.Scanner;


public class divide {

    public static void main(String[] args) {
        int num1=0,num2=0,div=0,rem=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = s.nextInt();
        System.out.println("Enter a second number: ");
        num2 = s.nextInt();
        
        if(num1 > num2){
        div = num1 / num2;
        rem = num1 % num2;
        
        System.out.println("The answer if " + num1 + " is divided by " + num2 +" will equal " + div +" remainder of " + rem);
        }
        
        if(num2 > num1){
        div = num2 / num1;
        rem = num2 % num1;
        
        System.out.println("The answer if " + num2 + " is divided by " + num1 +" will equal " + div +" remainder of " + rem);
        }
        
        
        
        
        
    }
    
}
