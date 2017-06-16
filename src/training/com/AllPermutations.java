package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class AllPermutations {

    public void AllNumberPermutations(int source[], int[] current, int idx, int sidx){
        if (idx >= current.length) {
           for (int i=0;i<current.length;i++)
            System.out.print(current[i]+" ");
           System.out.println();
           return;
        }


        for (int i = 0;i <sidx;i++) {
            current[idx] = source[idx];
            AllNumberPermutations(source, current, idx + 1, i);
        }
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] c = new int[a.length];
        AllPermutations ap = new AllPermutations();
        ap.AllNumberPermutations(a,c,0,a.length);
    }
}
