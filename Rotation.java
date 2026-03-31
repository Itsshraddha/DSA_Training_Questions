import java.util.Arrays;
public class Rotation {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;
        int[][] rotated = new int[n][n];
        // 90 degree rotation
        for(int i =0 ; i< mat.length;i++){
            for(int j = 0 ; j<mat[0].length ;j++){
                rotated[j][n-1-i] = mat[i][j];
            }
        }
        for(int i=0 ; i<mat.length; i++){
            for(int j=0 ; j< mat.length; j++){
                System.out.print(rotated[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
