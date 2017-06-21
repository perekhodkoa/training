package training.com;

/**
 * Created by sentinel on 6/20/17.
 */
public class MinHeap {


    private int maxSize;
    private int size;
    private int[] heap;

    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        heap = new int[maxSize+1];
    }

    public int leftChild(int parent){
        return parent * 2;
    }

    public int rightChild(int parent){
        return parent * 2+1;
    }

    public int getParent(int pos){
        return pos/2;
    }

    private boolean isLeaf(int pos){
        if (pos>= (size/2) && pos <=size){
            return true;
        }
        return false;
    }

    private void swap (int from, int to){
        int tmp;
        tmp = heap[from];
        heap[from] = heap[to];
        heap[to] = tmp;
    }

    private void minHeapify(int pos){
        if (!isLeaf(pos)){
            if (heap[pos] > heap[leftChild(pos)] || heap[pos]>heap[rightChild(pos)]){
                if (heap[leftChild(pos)]<heap[rightChild(pos)]){
                    swap(pos,leftChild(pos));
                    minHeapify(leftChild(pos));
                } else
                {
                    swap(pos,rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int value){
        size++;
        heap[size] = value;
        int current = size;

        while(heap[current]<heap[getParent(current)]){
            swap(current, getParent(current));
        }
    }

    public void remove(){
        int min = heap[1];
        size--;
        heap[1] = heap[size];
        minHeapify(1);
    }

    public void Heapify(){
        for (int i=size/2;i>=1;i--){
            minHeapify(i);
        }
    }

    public static void main(String[] args){
        MinHeap mh = new MinHeap(18);
        mh.insert(5);
        mh.insert(3);
        mh.insert(19);
        mh.insert(6);
        mh.insert(22);
        mh.insert(9);
        mh.insert(17);
        mh.insert(2);
        mh.insert(10);
        mh.insert(84);
        mh.Heapify();

        mh.insert(1);
        mh.Heapify();

        for (int i=1; i<=mh.size/2;i++){
            System.out.println(mh.heap[i] + " L: "+mh.heap[i*2] + "R: "+mh.heap[i*2+1]);
        }


    }
}
