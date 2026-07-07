import java.util.ArrayList;
import  java.util.* ;

public class DisappearedElements {
    public static void main(String[] args) {
        int[]  nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        // sort the array
        while (i < nums.length) {
            int element = nums[i] - 1;
            if (nums[i] != nums[element]) {
                // swap the numbers
                swap(nums, i, element);
            } else {
                i++;
            }
        }
        // searching disappeared elements
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(index+1);
            }
        }
        return list ;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}

