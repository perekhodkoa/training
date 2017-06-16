package training.com;

/**
 * Created by sentinel on 6/11/17.
 */
public class PrintPowerSet {

    public void PrintPSet(int[] a){

        int n = a.length;
        for (int i=0; i<1<<n;i++){
            for (int j=0;j<n;j++){
                if ((i & (1<<j)) >0) {
                    System.out.print(a[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int a[] = {1,2,3};
        PrintPowerSet pps = new PrintPowerSet();
        pps.PrintPSet(a);

    }
}
