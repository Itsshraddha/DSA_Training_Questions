import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int pod1 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int pod2 = nums[0]*nums[1]*nums[nums.length-1];



        return Math.max(pod1,pod2);
    }
}
