import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-82,0,32,12,5,2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-i-1;
            //find maximum element
            int max_idx = get_max(arr,0 ,last);
            swap(arr,max_idx,last);
        }

    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int get_max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
    return max ;
    }
}
