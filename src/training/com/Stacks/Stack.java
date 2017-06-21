package training.com.Stacks;

/**
 * Created by sentinel on 6/20/17.
 */
public class Stack {

    int[] stack;
    int size;

    public Stack(int capacity){
        stack = new int[capacity];
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public int peek(){
        return stack[size];
    }

    public void push(int value){
        stack[size%stack.length] = value;
        size++;
    }

    public int pop(){
        return stack[(--size)%stack.length];
    }


    public static void main(String[] args){
        Stack s = new Stack(5);

        for (int i=0; i <=4;i++)
        s.push(i+1);

        for (int i=0;i<=4;i++)
            System.out.print(s.pop()+" ");

    }
}
