package training.com;

import java.util.Stack;

/**
 * Created by sentinel on 6/14/17.
 */
public class MaxStackTradeOff {

    private int max;
    Stack<Integer> s = new Stack<>();

    public void push(Integer n){
        if (s.isEmpty()) {
            s.push(0);
            max = n;
        } else
        {
            s.push(max-n);
            if (max < n)
                max = n;
        }
    }

    public Integer pop(){
        Integer result = 0;

        if (!s.isEmpty()) {
            Integer n = s.pop();
             if (n <0){
                 result = max;
                 max = max + n;
            } else
                result = max-n;

            }

            return result;
        }

    public Integer getMax(){
        return max;
    }

    public static void main(String[] args){

        MaxStackTradeOff ms = new MaxStackTradeOff();
        ms.push(2);
        System.out.println(ms.getMax());
        ms.push(3);
        System.out.println(ms.getMax());
        ms.push(4);
        System.out.println(ms.getMax());
        ms.push(8);
        System.out.println(ms.getMax());
        ms.push(5);
        System.out.println(ms.getMax());
        System.out.println(" Popping..");
        System.out.println("Out: "+ms.pop());
        System.out.println("Max: " + ms.getMax());
        System.out.println("Out: "+ms.pop());
        System.out.println("Max: " + ms.getMax());
        System.out.println("Out: "+ms.pop());
        System.out.println("Max: " + ms.getMax());
        System.out.println("Out: "+ms.pop());
        System.out.println("Max: " + ms.getMax());
        System.out.println("Out: "+ms.pop());
        System.out.println("Max: " + ms.getMax());
    }
}
