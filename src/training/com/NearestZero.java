package training.com;

import javax.print.attribute.standard.Finishings;

/**
 * Created by sentinel on 6/11/17.
 */
public class NearestZero {

    public void FindDistances(int[] a){
        int distance = a.length+1;

        for (int i=0;i<a.length;i++){
            if (a[i] == 0)
                distance =0;

                a[i] = distance;
                distance++;
        }

       // distance = a.length+1;
        for (int i=a.length-1;i>=0;i--){
            if (a[i] == 0)
                distance = 0;
            if (a[i]>distance)
                a[i] = distance;
            distance++;
        }
    }

    public static void main(String[] args){

        NearestZero nz = new NearestZero();
        int[] a = {1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,1,0};
        nz.FindDistances(a);
        for (int i=0; i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
