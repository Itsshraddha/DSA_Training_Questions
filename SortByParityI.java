import java.util.Arrays;

public class SortByParityI {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityI(arr)));
    }
    static int[] sortArrayByParityI(int[] nums) {

        int[] ans = new int[nums.length];
        int i = 0;
        int j = ans.length-1;

        for(int index = 0 ; index < nums.length ;index++){
            if(nums[index]%2==0){
                ans[i] = nums[index];
                i++;
            }
            else{
                ans[j] = nums[index];
                j--;
            }
        }
        return ans ;
    }
}
