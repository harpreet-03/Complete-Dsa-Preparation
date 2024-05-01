public class Q2 {
    public static void main(String[] args) {
        int arr[] = { 1, 21, 3, 41, 5, 61};

        boolean isEven = false;

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
                isEven = true;

            }
        }

        if (!isEven) {
            System.out.println("Even number is not present");
        }

    }
}
