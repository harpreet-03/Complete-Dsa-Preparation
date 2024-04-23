public class Bsearch {
    public static int binarysearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = ((start + end) / 2);

            if (key < num[mid]) {
                end = mid - 1;
            } else if (key == num[mid]) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("Index for key is: " + binarysearch(num, key));
    }
}
