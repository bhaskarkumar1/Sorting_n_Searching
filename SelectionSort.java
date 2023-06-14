import java.util.Arrays;

class SelectionSort{
     public static void main(String[] args) {
        int[] arr= {5,6,9,7,8,1,2,7};

        for(int i=0;i<arr.length;i++){
            int min= i;
            int j;
            for( j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min= j;
                    
            }
            //you found the min index its time to sawp
            swap(arr,i,min);

        }

System.out.print(Arrays.toString(arr));
    }

    public static  void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}