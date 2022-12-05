import java.util.*;

public class fahrenhittocelcius {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);
        double fahrenhit, celcius;

        System.out.print("Enter the tempreture in fahrenhit: ");
        fahrenhit = sc.nextDouble();

        //Fahrenhit to celcius
        celcius = (fahrenhit-32) * 5/9;
        System.out.println("Tempreture in celcius is: " + celcius);
    }    
}
