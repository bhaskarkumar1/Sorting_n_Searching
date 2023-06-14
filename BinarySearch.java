public class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int x= 25;
       int result= Bsearch(arr, 0,arr.length-1,x);
        if(result != -1) System.out.println("found at index: "+result);
        else System.out.println("not found");
    }

    public static int Bsearch(int[] arr, int low, int high,int x){
        if(low<high){

        
        int mid= (low+high)/2;
        if(arr[mid]==x) return mid;
        if(arr[mid]>x){
            return Bsearch(arr, low, mid-1, x);
        }else{
           return  Bsearch(arr, mid+1, high, x);
        }
    }
        return -1;
    }
}