package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class AllPermutations {


        static void permute(int[] a, int k) {
            if (k == a.length) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(" [" + a[i] + "] ");
                }
                System.out.println();
            } else {
                for (int i = k; i < a.length; i++) {
                    int temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;

                    permute(a, k + 1);

                    temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;
                }
            }
        }

        public static void main(String args[]) {
            int N = 3;
            int[] sequence = new int[N];

            for (int i = 0; i < N; i++) {
                sequence[i] = i + 1;
            }

            permute(sequence, 0);

        }
    }