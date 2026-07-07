import java.util.*;
public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> ans = partition(s);
        System.out.println(ans);
    }
    static List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>(); // Stores all complete partitions
            backtrack(s, 0, new ArrayList<>(), result);
            return result;
    }
    static void backtrack(String s, int start, List<String> path,List<List<String>> result) {
            //base condition
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            //condition for palindrom check
            if (isPalindrome(s, start, end)) {
                //choose
                path.add(s.substring(start, end + 1));
                // explore
                backtrack(s, end + 1, path, result); // here (start = end +1 )
                // Undo (backtrack)
                path.remove(path.size() - 1);
            }
        }
    }
    //function for checking palindrom
    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            return true;
    }


}
