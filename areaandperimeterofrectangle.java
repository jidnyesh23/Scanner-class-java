import java.util.*;

public class areaandperimeterofrectangle {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        float length, breadth, area, perimeter;

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextFloat();

        //Area and perimeter of the rectangle
        area = length*breadth;
        perimeter = 2*(length+breadth);
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }    
}
