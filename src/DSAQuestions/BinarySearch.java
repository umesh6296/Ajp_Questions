package DSAQuestions;

public class BinarySearch {
    public static void binSearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                System.out.println("Number "+key+" found at index "+mid);
                return;
            } else if (key>arr[mid]) {
                low=mid+1;
            } else if (key<arr[mid]) {
                high=mid-1;
            }
        }
        System.out.println("Number "+key+" is not found.......!");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key=10;
        binSearch(arr,key);
    }
}
