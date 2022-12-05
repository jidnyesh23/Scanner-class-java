import java.util.*;

public class swaptwonumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, temp;

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of a: ");
        b = sc.nextInt();

        //swap
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);
    }    
}
