import java.util.*;

class MergeSort{
    public static void main(String[] args){
        int[] arr={1,8,423,32,53,34,52,5,2};
        msort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void msort(int[] arr, int low, int  high){
        if(low== high) return;
        int mid= (low+high)/2;
        msort(arr, low, mid);
        msort(arr, mid+1, high);
        merge(arr, low,mid, high);
    }

    public static void merge(int arr[], int low , int mid, int high){
        int left= low;
        int right= mid+1;
        List<Integer> ls = new ArrayList<>();
        while(left<=right && right<=high ){
            if(arr[left]>arr[right]){
                ls.add(arr[right]);
                right++;
            }
            else{
                ls.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            ls.add(arr[left]);
            left++;
        }
        while(right<=high){
            ls.add(arr[right]);
            right++;

        }

        for(int i=low;i<=high;i++){
            arr[i]=ls.get(i-low);
        }
    }
}