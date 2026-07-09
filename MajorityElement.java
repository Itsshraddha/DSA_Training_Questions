public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,3,2,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
        int count = 0 ;
        int element = 0 ;

        for(int i=0; i < nums.length; i++){
            if(count == 0){
                element = nums[i];
                count+=1;
            }
            else if(element == nums[i]){
                count+=1;
            }
            else{
                count--;
            }
        }
        return element;
    }
}
