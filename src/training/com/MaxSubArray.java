package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class MaxSubArray {

    public int getMax(int[] a){

        int max =Integer.MIN_VALUE;
        int current =0;

        for (int i=0; i<a.length;i++){
            current +=a[i];
            if (current > max)
                max = current;
            if (current<0)
                current = 0;
        }
        return max;
    }
    public static void main(String[] args){
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSubArray ma = new MaxSubArray();
        System.out.println(ma.getMax(a));
    }
}
