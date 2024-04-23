

public class Move_Zeroes_toEnd {
    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeroes(int[] arr) {
        int j = 0;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 4, 12};
        moveZeroes(arr);
        print(arr);

    }
}
