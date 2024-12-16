package ArrayQuestions;

import java.util.Scanner;

public class RectangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Row
        int m = sc.nextInt();//Column
        int[][] matrix = new int[n][m];

        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Increment and print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

