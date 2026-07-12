import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParity2(arr)));
    }
    static int[] sortArrayByParity2(int[] nums) {

        int[] ans = new int[nums.length];
        int i = 0;
        int j = ans.length-1;

        for(int index = 0 ; index < nums.length ;index++){
            if(nums[index]%2==0){
                ans[i] = nums[index];
                i+=2;
            }
            else{
                ans[j] = nums[index];
                j-=2;
            }
        }
        return ans ;
    }
}
