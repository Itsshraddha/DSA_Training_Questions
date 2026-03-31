import java.util.Arrays;
public class CountOccurrence {
    public static void main(String[] args) {
        int n =10 ;
        int[] arr = {1,2,3,3,4,1,4,5,1,2};
        Arrays.sort(arr);
        int count = 1;

        for(int i=0 ; i<arr.length-1; i++){
                if ( arr[i] == arr[i+1]){
                    count ++ ;
                }
                else {
                    System.out.println(arr[i]+" occurs "+count+ " times" );
                    count = 1;

            }
        }
        System.out.println(arr[arr.length-1]+" occurs "+count+ " times" );

    }
}
