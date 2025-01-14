package ArrayQuestions;

public class Traverse2dArray {
    public static void main(String[] args) {
       // colum_wise();
        n_Traversal();
       // n_traversal_Reverse();
       // diamondTraversal();
       // spiral_traversal();
       // circular_traversal();
    }
    public static void colum_wise(){
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=arr[0].length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j][i]+" ");
            }
        }
       // output:-  3 6 9 2 5 8 1 4 7
    }
    public static void n_Traversal(){
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=arr[0].length-1;i>=0;i--){
            System.out.println(arr[i][0]+" ");
        }
        for(int i=1;i< arr.length;i++){
            System.out.println(arr[i][i]+" ");
        }
        for(int i= arr.length-2;i>=0;i--){
            System.out.println(arr[i][arr[0].length-1]+" ");
        }
        //output:-7 4 1 5 9 6 3
    }

    public static void n_traversal_Reverse() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + " ");
        }
        //output:- 1 4 7

        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i][i] + " ");
        }
        //output:- 5

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i][arr.length - 1] + " ");
        }
        //output:- 3 6 9
    }

    public static void diamondTraversal() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print(arr[1][2] + " "); // 6
        System.out.print(arr[0][1] + " "); // 2
        System.out.print(arr[1][0] + " "); // 4
        System.out.print(arr[2][1] + " "); // 8
    }

    public static void spiral_traversal(){
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + " ");
        }// 1 5 9
        for(int i=1;i<arr[2].length;i++){
            System.out.print(arr[2][i] + " ");
        }// 10 11 12
        for(int i= arr.length-2;i>=0;i--){
            System.out.print(arr[i][arr[0].length-1]+" ");
        }
        for(int i=arr[0].length-2;i>0;i--){
            System.out.print(arr[0][i]+" ");
        }//3 2
        for(int i=1;i<arr[1].length-1;i++){
            System.out.print(arr[1][i] + " ");
        }// 6 7
    }
    public static void circular_traversal(){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i =  arr.length-1; i>=0; i--) {
            System.out.print(arr[i][0] + " ");
        }
        //output:- 7 4 1
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[0][i]+" ");
        }//2 3
        for (int i = 1; i< arr.length; i++) {
            System.out.print(arr[i][arr.length-1] + " ");
        }//6 9
        for(int i= arr.length-1;i>=arr.length-2;i--){
            System.out.print(arr[i][1]+" ");
        }//8 5
    }





}
