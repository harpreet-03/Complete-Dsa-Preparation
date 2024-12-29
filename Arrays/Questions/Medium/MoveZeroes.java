public class MoveZeroes {
    public static void move(int arr[]){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j<arr.length){
            arr[j] =0;
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        move(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}


/* int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i = j; i < nums.length; i++) {
            nums[i] = 0;
            
*/