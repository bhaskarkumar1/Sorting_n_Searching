import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {45, 6, 8, 7, 22, 4, 2, 5, 4, 1};
        Qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Qs(int[] arr, int low, int high) {
        if (low < high) {
            int partIndex = f(arr, low, high);
            Qs(arr, low, partIndex - 1);
            Qs(arr, partIndex + 1, high);
        }
    }

    public static int f(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low ;
        int right = high;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }

        swap(arr, low, right);
        return right;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
