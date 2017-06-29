package training.com.ArithmeticOperations;

/**
 * Created by sentinel on 6/28/17.
 */
public class SquareRoot {

    public int Sqrt(int x){

        int lo =0;
        int hi = x;
        int m = (lo+hi)/2;
        while((m-1)*(m-1) >= x || (m+1)*(m+1) <= x){
            if (m*m>x){
                hi = m;
            }
            else
            {
                lo = m;
            }
            m = (lo+hi)/2;
        }

        return m;

    }

    public static void main(String[] args){

        SquareRoot s = new SquareRoot();
        System.out.print(s.Sqrt(16));
    }
}
