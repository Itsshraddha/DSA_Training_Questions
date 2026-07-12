import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s= {1,1,2};
        System.out.println(assignCookie(g,s));

    }

    static int assignCookie(int[] g, int[] s){
        int i=0 ,j=0;
        int children =0 ;
        // sort both array
        Arrays.sort(g);
        Arrays.sort(s);

        while(i<g.length && j<s.length){

            if(s[j] >= g[i]){
                children++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return children;
    }
}
