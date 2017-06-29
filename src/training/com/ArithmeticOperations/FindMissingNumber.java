package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class FindMissingNumber {

    public int getMissingNumber(int[] arr, int N){

        int i = N-1;

        while (i>=0){
            N = N ^ i ^ arr[i];

            i--;
        }
        return N;
    }

    public static void main(String[] args){
        int a[] = {0,1,2,4,5,6,7,8,9};
        FindMissingNumber fn = new FindMissingNumber();
        System.out.println(fn.getMissingNumber(a,9));
    }
}
