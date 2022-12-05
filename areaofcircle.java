import java.util.*;

public class areaofcircle {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        double radius;

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextFloat();
        
        //area of circle
        double areaofcircle = (3.14)*radius*radius;
        System.out.println("Area of circle is: " + areaofcircle);
    }    
}
