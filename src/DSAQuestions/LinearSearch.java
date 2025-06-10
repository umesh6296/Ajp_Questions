package DSAQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={44,2,7,2,99,11,23};
        int key=44;
        linSearch(arr,key);
    }
    public static void linSearch(int []arr,int key){
        boolean found=false;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                break;
            }else{
                count++;
            }
        }
        if(found){
            System.out.println("Number "+key+" found at index "+count);
        }else{
            System.out.println("Number "+key+" is not found.......!");
        }
    }

}
