package training.com.Matrices;

/**
 * Created by sentinel on 6/19/17.
 */
public class SpiralMatrix {

    public void printSpiralMatrix(int[][] matrix, int originalSize, int size){
        int row, col;

        if (size<1){
            return;
        }

        row = col = (originalSize-size)/2;
        if (size == 1){
            System.out.print(matrix[row][col] + " ");
            return;
        }

        for(int i=0;i<size-1;++i){
            System.out.print(matrix[row][col++]+" ");
        }

        for(int i=0;i<size-1;++i){
            System.out.print(matrix[row++][col]+" ");
        }

        for(int i=0;i<size-1;++i){
            System.out.print(matrix[row][col--]+" ");
        }

        for(int i=0;i<size-1;++i){
            System.out.print(matrix[row--][col]+" ");
        }
        printSpiralMatrix(matrix,originalSize,size-2);
    }

    public static void main(String[] args){

        int[][] a = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}};

        SpiralMatrix sm = new SpiralMatrix();
        sm.printSpiralMatrix(a,6,6);
    }
}
