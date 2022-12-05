import java.util.*;

public class areaandperimeterofcircle {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        Double radius, area, perimeter;

        System.out.print("Enter the radius ofthe circle: ");
        radius = sc.nextDouble();

        //Area and perimeter of the circle
        area = 3.14*radius*radius;
        perimeter = 2*3.14*radius;
        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }    
}
