package training.com.Stacks;

import java.util.Stack;

/**
 * Created by sentinel on 6/11/17.
 */
public class MaxStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> max = new Stack<>();
    int currentMax = Integer.MIN_VALUE;

    public void push(int value){
        stack.push(value);
        if (value>=currentMax){
            max.push(currentMax);
            currentMax = value;
        }
    }

    public int pop(){
        int value = stack.pop();
        if (value == currentMax){
            currentMax = max.pop();
        }
        return value;
    }

    public int getCurrentMax(){
        return currentMax;
    }


    public static void main(String[] args){
        MaxStack ms = new MaxStack();
        ms.push(1);

        System.out.println(ms.getCurrentMax());
        ms.push(5);

        System.out.println(ms.getCurrentMax());
        ms.push(5);

        System.out.println(ms.getCurrentMax());
        ms.push(20);

        System.out.println(ms.getCurrentMax());
        ms.push(5);

        System.out.println(ms.getCurrentMax());

        System.out.println();
        System.out.println("Popped:"+ms.pop());
        System.out.println(ms.getCurrentMax());

        System.out.println("Popped:"+ms.pop());
        System.out.println(ms.getCurrentMax());

        System.out.println("Popped:"+ms.pop());
        System.out.println(ms.getCurrentMax());

        System.out.println("Popped:"+ms.pop());
        System.out.println(ms.getCurrentMax());

    }
}
