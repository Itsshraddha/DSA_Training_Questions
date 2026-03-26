import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        List<Integer> factor = new ArrayList<>();
        int num = 54;
        int n = Math.abs(num);

        if(n==0){
            System.out.println("No Factor");
        }

        for(int i = 1 ; i<=n ; i++){
            if(n%i == 0){
                factor.add(i);
            }
        }
        System.out.println(factor);
    }
}
