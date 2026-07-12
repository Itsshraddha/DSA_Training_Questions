import static java.util.Arrays.sort;

public class ThirdMax {
    public static void main(String[] args) {

        int[] arr = {3,2,1,5,2,5};
        System.out.println(thirdMax(arr));

    }
    static int thirdMax(int[] nums){
        int count =1, i= nums.length-1 ;

        sort(nums);

        while(i>0){

            if(nums[i] != nums[i-1]){
                count++;
            }

            if(count == 3){
                return nums[i-1];
            }

            i--;
        }

        return nums[nums.length-1];
    }
}
