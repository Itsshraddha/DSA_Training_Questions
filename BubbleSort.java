import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-15,20,0,91,-3,5,-44};
        System.out.println(Arrays.toString(bubble_Sort(arr)));
    }

    static int[] bubble_Sort(int[] arr) {
        boolean swapped;
        // iteration over the array - passes
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // inner loop where max element goes to its respective indexes
            for (int j = 1; j < arr.length - i; j++) {
                // swapping the element
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for particular value of i , then break the loop as array is sorted
            if(swapped == false){
                break;
            }
        }
        return arr;
    }
}