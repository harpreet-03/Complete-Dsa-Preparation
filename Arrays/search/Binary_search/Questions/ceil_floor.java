public class ceil_floor {

    private static int ceil(int [] num, int key) {
        int start = 0, end = num.length-1;

        // what is target is greater than the greatest number in the array
        if(key > num[num.length-1]) return -1;


        while(start <= end) {
            int mid = start + (end - start)/2;

            if(num[mid] >= key) end = mid-1;
            else start = mid + 1;
        }
        return start;
    }

    private static int floor(int[] num, int key) {
        int start = 0, end = num.length-1;


        while(start <= end) {
            int mid = start + (end - start)/2;

            if(num[mid] > key) end = mid-1;
            else start = mid + 1;
        }
        return  end;
    }
    public static void main(String[] args) {
        int num[] = { 2, 3, 5, 9, 14, 16, 18 };
        int key = 15;

        System.out.println("Ceil for key is: " + ceil(num, key));
        System.out.println("Floor for key is: " + floor(num, key));
    }
}
