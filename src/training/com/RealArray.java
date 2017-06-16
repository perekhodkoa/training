package training.com;

/**
 * Created by sentinel on 6/11/17.
 */
public class RealArray {

    public float calculateAvg(float[] a){
        float max=a[0];
        float min=a[0];
        float sum=0;
        float count=0;

        for (int i=0; i< a.length;i++){
            if (a[i] > max)
                max = a[i];
            if (a[i]<min)
                min = a[i];
            sum+=a[i];
            count++;
        }

        return (sum-max-min)/(count-2);
    }
}
