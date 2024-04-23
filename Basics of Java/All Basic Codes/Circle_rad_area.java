import java.util.*;

public class Circle_rad_area {

    public static void main(String[] args) {

        // Make a program that takes Radius of a circle as input,
        // calculates area and prints it as output to the use

        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();

        float pi = (float) 3.14; // or  =  3.14f;

        float area = (float) (pi * r * r);/// or float area = 3.14f * r*r; here f means float

        System.out.println(area);

        // 7
        // 153.86002 [area]

        // Area of rectangle, parameter of rectangle:

        // Scanner s = new Scanner(System.in);
        // int l = s.nextInt();
        // int b = s.nextInt();
        // int para_rec = (int) 2*(l + b);
        // int area_rec = (int) l*b;

        // System.out.println(para_rec);
        // System.out.println(area_rec);
        // 25
        // 4
        // 58 [parameter]
        // 100 [area]

    }
}
