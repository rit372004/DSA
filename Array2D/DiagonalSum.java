package Array2D;

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {

        int sum = 0;
        int n = matrix.length;
        
        //TC --> O(n^2)
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         //PD
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         //SD 
        //         else if (i + j == n-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        //TC --> O(n)
        for (int i=0; i<n; i++) {
            //PD
            sum += matrix[i][i];
            //SD
            if (i != n-1-i) {
                sum += matrix[i][n-i-1];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        
        int matrix[][] = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}, 
                           {13, 14, 15, 16} };  
                           
         System.out.println(diagonalSum(matrix));                  

    }
    
}
