import java.util.*;

public class divisiblebyfive {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        //Divisible by 5
        if (num % 5 == 0) {
            System.out.println("The number completely divisible by 5.");
        } else {
            System.out.println("The number does not divisible by 5.");
        }
    }    
}
