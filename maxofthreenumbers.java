import java.util.*;

public class maxofthreenumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, num3;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        //Find max of three numbers
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the biggest number.");
            } else {
                System.out.println(num3 + " is biggest number.");
            }
        } else if (num2 > num3) {
            System.out.println(num2 + " is biggest number.");
        } else {
            System.out.println(num3 + " is biggest number.");
        }
        
    }    
}
