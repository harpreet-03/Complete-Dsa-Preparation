import java.util.*;

public class Switchh {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int Button = x.nextInt();

        switch (Button){
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Invalid button");
        }

    }

}
