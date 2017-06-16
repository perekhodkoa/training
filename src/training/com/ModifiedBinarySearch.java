package training.com;

/**
 * Created by sentinel on 6/14/17.
 */
public class ModifiedBinarySearch {

    public int getMin(int[] a, int l, int h){

        if (l==h){
            return a[l];
        }

        if (h-l == 1)
            return Math.min(a[l],a[h]);

        int m = (l+h)/2;

        int r;

        if (a[m-1]<a[m])
            r = getMin(a,l,m);
        else
            r = getMin(a,m,h);
        return r;
    }

    public static void main(String[] args){

        int[] a = {9,8,7,6,5,3,2,1,3,4,5};

        ModifiedBinarySearch mbs = new ModifiedBinarySearch();
        System.out.println(mbs.getMin(a,0,a.length-1));

    }
}
