public class Jagged_Array {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][]; // Create a jagged array with 3 rows

        // Assign arrays of different sizes to each row
        jaggedArray[0] = new int[3]; // First row has 3 columns
        jaggedArray[1] = new int[2]; // Second row has 2 columns
        jaggedArray[2] = new int[4]; // Third row has 4 columns

        // Assign values to the elements
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;

        jaggedArray[1][0] = 4;
        jaggedArray[1][1] = 5;

        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;
        jaggedArray[2][2] = 8;
        jaggedArray[2][3] = 9;

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
