import java.util.*;

public class squareandcubesofonetoten {
    public static void main (String [] aargs) {
        Scanner sc = new Scanner (System.in);
        int array[] = new int[11];

        for (int i = 1; i <= 10; i++) {
            array[i] = i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i +") " + "Square: " + i*i + " and cube: " + i*i*i);
        }
    }    
}
