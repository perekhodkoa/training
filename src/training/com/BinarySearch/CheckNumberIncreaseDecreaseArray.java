package training.com.BinarySearch;

/**
 * Created by sentinel on 6/20/17.
 */
public class CheckNumberIncreaseDecreaseArray {

    private int getIndexMaximum(int[]a, int l, int h){

        if (l==h){
            return l;
        }

        if (h==l+1){
            return a[h]>a[l]?h:l;
        }

        int m = (h+l)/2;
        if (a[m-1]<a[m] && a[m]>a[m+1])
            return m;

        if (a[m-1]>a[m] && a[m]>a[m+1])
            return getIndexMaximum(a,l,m-1);
        else
            return getIndexMaximum(a,m+1,h);
    }

    private boolean classicBinarySearch(int[] a, int n, int l, int h){

        if (h==l)
            return a[h] == n;

        int m = (h+l)/2;

        if  ((n < a[m] && a[m]<a[m+1]) || (a[m]>a[m+1] && a[m]<n ))
            return classicBinarySearch(a,n,l,m-1);
        else
            return classicBinarySearch(a,n,m+1,h);

    }

    public boolean checkNumber(int[] a, int n){

        int max = getIndexMaximum(a,0,a.length-1);
        return classicBinarySearch(a,n,0,max-1) || classicBinarySearch(a,n,max,a.length);
    }

    public static void main(String[] args){

        int a[] = {1,3,5,7,4,2};
        CheckNumberIncreaseDecreaseArray c = new CheckNumberIncreaseDecreaseArray();
        System.out.print(c.checkNumber(a,6));
    }
}
