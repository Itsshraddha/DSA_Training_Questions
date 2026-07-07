import java.util.Arrays;

public class CyclicSort
{
    // if you find any array of range in [1,N] or [0,N] or any range pply cyclic sort
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,4,5};
        c_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void c_Sort(int[] arr) {
        int i=0;
        while (i < arr.length){
            int element = arr[arr[i] - 1];
            if(arr[i] != element){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
