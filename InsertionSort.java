import java.util.Arrays;

public class InsertionSort {
 public static void main(String[] args){
    int[] arr= {7,8,9,4,5,7,5,4,20,0};

    for(int i=0;i<arr.length;i++){
        int j=i;
        while(j>0 && arr[j-1]> arr[j]){
            // swap
            swap(arr, j);
            j--;
        }
    }
System.out.println(Arrays.toString(arr));
 }  
 public static void swap(int[] arr,int j ) {
    int temp=arr[j];
    arr[j]=arr[j-1];
    arr[j-1]=temp;
 }
}
