package ArrayQuestions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SpiralArray {
    public static void main(String[] args) {
        int [][] matrix={
                {31,32,33,34,35},
                {36,37,38,39,40},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i][0]+" ");
        }
        for(int k=1;k<matrix[matrix.length-1].length;k++){
            System.out.print(matrix[matrix.length-1][k]+" ");
        }
        for(int j=matrix.length-2;j>=0;j--){
            System.out.print(matrix[j][matrix[j].length-1]+" ");
        }
        for(int i=matrix[0].length-2;i>=1;i--){
            System.out.print(matrix[0][i]+" ");
        }
        for(int i=1;i<=matrix.length-2;i++){
            System.out.print(matrix[i][1]+" ");
        }
        for(int k=2;k<=matrix[matrix.length-2].length-2;k++){
            System.out.print(matrix[matrix.length-2][k]+" ");
        }
        for(int i=matrix.length-2;i>=matrix.length-4;i--){
            System.out.print(matrix[i][matrix[i].length-2]+" ");
        }
        for(int i=1;i<matrix.length-2;i++){
            System.out.print(matrix[i][matrix[i].length-3]+" ");
        }



    }
}
