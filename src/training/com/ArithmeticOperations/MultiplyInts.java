package training.com.ArithmeticOperations;

/**
 * Created by sentinel on 6/11/17.
 */
public class MultiplyInts {

    public int divide(int a, int b){

        int result = 0;
        while (b>0){
            if ((b & 1) > 0)
                result+= a;
            a = a << 1;
            b = b >> 1;
        }

        return result;
    }

    public static void main(String[] args){
        MultiplyInts mi = new MultiplyInts();
        System.out.println(mi.divide(4,8));
    }
}
