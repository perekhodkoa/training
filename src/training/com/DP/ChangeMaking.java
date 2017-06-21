package training.com.DP;

/**
 * Created by sentinel on 6/11/17.
 */
public class ChangeMaking {

    public int GetChange(long amount, int[] coins, int idx, String current){

        if (idx >= coins.length){
            if (amount == 0) {
                System.out.println(current);
                return 1;
            }
            return 0;
        }

        int coin = coins[idx];
        int ways = 0;
        for (int i=0; amount>=coin*i;i++){
            ways+= GetChange(amount-coin*i,coins,idx+1, current+" "+i+"x"+coin);
        }

        return ways;
    }

    public static void main(String[] args){
        int[] a = {1,2};
        ChangeMaking cm = new ChangeMaking();

        System.out.println(cm.GetChange(9,a,0,""));
    }
}
