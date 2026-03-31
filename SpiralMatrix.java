import java.util.*;
import java.util.Arrays;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of row = ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of col = ");
        int col = sc.nextInt();
        System.out.println("Enter the "+(rows*col)+" elements of matrix");
        int[][] mat = new int[rows][col];
        for(int i =0 ; i<rows ;i++){
            for(int j=0 ;j<col ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int left =0 , right = col-1 , top =0 ,bottom = rows-1;

        while(left<=right && top<=bottom){
            // left -- right
            for(int i = left ; i<= right ; i++){
                System.out.print(mat[top][i]+" ");
            }
            top ++ ;
            // top -- bottom
            for(int i = top ; i<= bottom ; i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;

            //right-- left
            for(int i = right ; i>=left ; i--){
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;

            // bottom -- top
            for(int i = bottom ; i>= top ; i--){
                System.out.print(mat[i][left]+" ");
            }
            left++;
        }

    }
}
