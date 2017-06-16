package training.com;

/**
 * Created by sentinel on 6/11/17.
 */
public class ReverseInt {

    public int reverse(int x){
        int y = 0;
        while (x >= 1 ){
            y = y*10+x%10;
            x = x/10;
        }
        return y;
    }
    public static void main(String[] args){

        ReverseInt ri = new ReverseInt();
        System.out.print(ri.reverse(1230));
    }
}
