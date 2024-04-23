import java.util.*;

public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Print top row
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(matrix[rowStart][j] + " ");
            }

            // Print right Column
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }

            // Print bottom row
            for (int j = colEnd - 1; j >= colStart; j--) {
                if (rowStart == rowEnd) {
                    break;
                }
                System.out.print(matrix[rowEnd][j] + " ");
            }

            // Print left row
            for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
                if (colStart == colEnd) {
                    break;
                }
                System.out.print(matrix[i][colStart] + " ");
            }

            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // int matrix[][] = { { 1, 2, 3},
        // { 4,5,6 },
        // {7,8,9} };

        printSpiral(matrix);

    }
}
