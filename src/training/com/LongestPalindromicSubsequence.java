package training.com;

/**
 * Created by sentinel on 6/15/17.
 */
public class LongestPalindromicSubsequence {

    int max (int x, int y) { return (x > y)? x : y; }

    int lps(String seq, int i, int j)
    {
        // Base Case 1: If there is only 1 character
        if (i == j)
            return 1;

        // Base Case 2: If there are only 2 characters and both are same
        if (seq.charAt(i) == seq.charAt(j) && i + 1 == j)
            return 2;

        // If the first and last characters match
        if (seq.charAt(i) == seq.charAt(j))
            return lps (seq, i+1, j-1) + 2;

        // If the first and last characters do not match
        return max( lps(seq, i, j-1), lps(seq, i+1, j) );
    }


    public static void main(String[] args){

        LongestPalindromicSubsequence l = new LongestPalindromicSubsequence();
        String r = "rrabba";
        System.out.println(l.lps(r,0,r.length()-1));
    }
}
