import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // find missing number in array range [0,N]
        // Leetcode problem - used cyclic sort
        int[] arr = {3,0,1};
        System.out.println(findMissingNumber(arr));

    }

    static int findMissingNumber(int[] arr) {
        int i= 0;
        // sort the array
        while(i < arr.length){
           int  element = arr[i];
            if(arr[i]< arr.length && arr[i]!= arr[element] ){
                // swap the numbers
                swap(arr ,i ,element);
            }
            else {
                i++;
            }
        }
        //finding missing number
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
