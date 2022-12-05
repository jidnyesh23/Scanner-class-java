import java.util.*;

import java.util.*;

public class evenodd {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.print("Enter any number: ");
        num = sc.nextInt();

        //identify it's Even or Odd
        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
    }
}
