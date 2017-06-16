package training.com;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LongestCommonWordSequence {


    //recursive O(2^n)
    static int longestCommonSeq2(final String s1, final String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        final String[] c1 = s1.split(" ");
        final String[] c2 = s2.split(" ");

        return longestCommonSeq2(c1, c2, c1.length - 1, c2.length - 1);
    }

    private static int longestCommonSeq2(String[] c1, String[] c2, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (Objects.equals(c1[i], c2[j])) {
            return 1 + longestCommonSeq2(c1, c2, i - 1, j - 1);
        }
        return Math.max(longestCommonSeq2(c1, c2, i - 1, j), longestCommonSeq2(c1, c2, i, j - 1));
    }


    //dp O(m*n)
    static int longestCommonSeq(final String s1, final String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        final String[] c1 = s1.split(" ");
        final String[] c2 = s2.split(" ");
        int n = c1.length;
        int m = c2.length;
        int[][] l = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    l[i][j] = 0;
                } else if (Objects.equals(c1[i - 1], c2[j - 1])) {
                    l[i][j] = l[i - 1][j - 1] + 1;
                } else {
                    l[i][j] = Math.max(l[i - 1][j], l[i][j - 1]);
                }
            }
        }

        return l[n][m];
    }




    //dp O(m*n)
    static int longestCommonSeq3(final String s1, final String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }

        memo = new HashMap<>();
        final String[] c1 = s1.split(" ");
        final String[] c2 = s2.split(" ");

        return longestCommonSeq3(c1, c2, c1.length - 1, c2.length - 1);
    }

    private static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair p = (Pair) o;
            return Objects.equals(p.i, this.i) && Objects.equals(p.j, this.j);
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    private static Map<Pair, Integer> memo;

    private static int longestCommonSeq3(String[] c1, String[] c2, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        final Pair p = new Pair(i, j);
        Integer m = memo.get(p);
        if (m != null) {
            return m;
        }
        if (Objects.equals(c1[i], c2[j])) {
            m = 1 + longestCommonSeq3(c1, c2, i - 1, j - 1);
        } else {
            m = Math.max(longestCommonSeq3(c1, c2, i - 1, j), longestCommonSeq3(c1, c2, i, j - 1));
        }
        memo.put(p, m);
        return m;
    }
}