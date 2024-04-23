import java.util.*;

public class Calculator_Switch {

    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = cal.nextInt();
        System.out.print("enter b: ");
        int b = cal.nextInt();
        System.out.print("enter operator number: ");
        int operator = cal.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }

}
