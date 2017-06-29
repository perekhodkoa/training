package training.com.Matrices;

/**
 * Created by sentinel on 6/20/17.
 */
public class DiaginalMatrix {

    public void printIt(int a[][]){
        int rows = a.length;
        int cols = a[0].length;

        for (int i = 1; i<=rows+cols-1;i++){
            int column = Math.max(0, i - rows);
            int count = Math.min(Math.min(i, cols-column),rows);

            for (int j=0;j<count;j++){
                System.out.print(a[Math.min(i,rows)-j-1][column+j]+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        int a[][] = {{1,2,3},
        {4,5,6},
        {7,8,9}};

        DiaginalMatrix dm = new DiaginalMatrix();
        dm.printIt(a);
    }
}
