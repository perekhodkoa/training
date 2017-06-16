package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class Profit {

    public int maxProfit(int[] a){
        int profit =0;
        int min = a[0];
        int runner =1;

        while (runner<a.length){

            if (a[runner]>=min && profit < a[runner]-min)
                profit=a[runner]-min;

            if (min > a[runner])
                min = a[runner];

            runner++;
        }
        return profit;
    }

    public static void main(String[] args){
        int[] a = {23,25,20,15,70,45,96};

        Profit p = new Profit();
        System.out.println(p.maxProfit(a));
    }
}
