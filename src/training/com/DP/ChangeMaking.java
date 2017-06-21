package training.com.DP;

/**
 * Created by sentinel on 6/11/17.
 */
public class ChangeMaking {

    public int GetChange(long amount, int[] coins, int idx, String current, int[][] map){

        if (map[(int)amount][idx]>0){
            return map[(int)amount][idx];
        }

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
          //  ways+= GetChange((int)amount-coin*i,coins,idx+1, current+" "+i+"x"+coin);
        }
        map[(int)amount][idx] = ways;
        return ways;
    }

    public static void main(String[] args){
        int[] a = {1,2};
        ChangeMaking cm = new ChangeMaking();

        int amount = 9;
        int[][] map = new int[amount+1][a.length+1];
        System.out.println(cm.GetChange(amount,a,0,"",map));
    }
}
