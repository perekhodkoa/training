package training.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sentinel on 6/11/17.
 */
public class PairsToSum {

    public void getPairs(int[] a, int s){
        Set<Integer> aset = new HashSet<>();
        for (int i=0; i< a.length; i++){
            aset.add(a[i]);
        }

        for (int i=0; i < a.length; i++){
            if (aset.contains(s-a[i])){
                System.out.println("{"+a[i]+","+(s-a[i])+"}");
            }
        }
    }

    public static void main(String[] args){
        PairsToSum pts = new PairsToSum();
        int[] a = {2,7,5,4,3,6};
        pts.getPairs(a,9);
    }
}
