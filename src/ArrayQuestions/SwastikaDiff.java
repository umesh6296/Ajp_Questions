package ArrayQuestions;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SwastikaDiff {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int sum1=0;
        //print left bottom to right top
        for(int i=0;i<1+matrix[4].length/2;i++){
            sum1+=matrix[4][i];
        }
        for(int i=matrix.length-2;i>=0;i--){
            sum1+=matrix[i][matrix[i].length/2];
        }
        for(int i=1+matrix[0].length/2;i<matrix[0].length;i++){
            sum1+=matrix[0][i];
        }
        System.out.println("Sum of left bottom to right top: "+sum1);
        //print left top to right bottom
        int sum2=0;
        for(int i=0;i<=matrix.length/2;i++){
            sum2+=matrix[i][0];
            if(i==matrix.length/2){
                for(int j=0;j<matrix[matrix.length/2].length;j++){
                    sum2+=matrix[matrix.length/2][j];
                    if(j==matrix[matrix.length/2].length-1){
                        for(int k=matrix.length/2;k<matrix.length;k++){
                            sum2+=matrix[k][matrix[k].length-1];
                        }
                    }
                }
            }
        }
        System.out.println("Sum of left top to right bottom: "+sum2);
        System.out.println("Different between Sum1 and Sum2: "+(sum1-sum2));


    }
}