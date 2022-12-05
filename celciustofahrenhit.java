import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class celciustofahrenhit {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        double celcius, fahrenhit;

        System.out.print("Enter the tempreture in celcius: ");
        celcius = sc.nextDouble();

        //celcius to fahrenhit
        fahrenhit = (celcius*1.8)+32;
        System.out.println("Tempreture infahrenhit is: " + fahrenhit);
    }    
}
