package training.com;

/**
 * Created by sentinel on 6/12/17.
 */
public class MoveZeroes {

    public void moveIt(int[] a){
        int idx = -1;
        for (int i=0; i<a.length;i++){
            if (a[i] == 0 && idx == -1)
                idx = i;
            if (a[i]!=0 && idx!=-1){
                a[idx] = a[i];
                a[i] = 0;
                idx++;
            }
        }
    }

    public static void main(String[] args){
        int[] a= {0,1,2,3,0,0,4,0,5,0,6,0,0,0,0,7};
        MoveZeroes mz = new MoveZeroes();
        mz.moveIt(a);
        for (int i=0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
