import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={4,8,2,7,4,9,8,6,7,3,8,2,7,4,9,8,6,7,3};
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}
