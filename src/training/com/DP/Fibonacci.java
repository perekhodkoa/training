package training.com.DP;

/**
 * Created by sentinel on 6/26/17.
 */
public class Fibonacci {

    public int Fib(int n, int[] memo){
        int f =0;
        if (memo[n] !=0)
            return memo[n];

        if (n <= 2)
            f = 1;
        else
            f = Fib(n-1,memo)+Fib(n-2, memo);

        memo[n] = f;
        return f;
    }

    public static void main(String[] args){

        Fibonacci fib = new Fibonacci();
        int n=20;
        System.out.println(fib.Fib(n,new int[n+1]));
    }
}
