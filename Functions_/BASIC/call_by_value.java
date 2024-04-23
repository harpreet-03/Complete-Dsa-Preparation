/**
 * The class demonstrates the concept of call by value in Java through a swap method.
 */
// `System.out.println("Before Swapping");` is printing the message "Before Swapping" to the
// console.
public class call_by_value {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // swap case
        int temp;
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping");
        System.out.println("a = " + a); // 5 
        System.out.println("b = " + b); // 10
        swap(a, b);

    }
}
