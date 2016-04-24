/**
 * Created by Andrew on 4/18/2016.
 */

// Source: http://www.sanfoundry.com/java-program-implement-max-heap/

public class MaxHeap
{
    private long[] Heap;
    public int size;
    private int maxsize;

    private static final int FRONT = 1;

    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new long[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
//        System.out.println(pos);
//        System.out.println(size);
//        System.out.println(size/2);
        if (pos >=  (size / 2.0)  &&  pos <= size)
        {
            return true;
        }
        return false;
    }

    private void swap(int fpos,int spos)
    {
        long tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void maxHeapify(int pos)
    {
//        System.out.println("passed0");
        if (!isLeaf(pos))
        {
//            System.out.println("passed1");
            if ( Heap[pos] < Heap[leftChild(pos)]  || Heap[pos] < Heap[rightChild(pos)])
            {
//                System.out.println("passed2");
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)])
                {
//                    System.out.println("passed3");
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }
                else
                {
//                    System.out.println("pass4");
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(long element)
    {
        Heap[++size] = element;
        int current = size;

        while(Heap[current] > Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                    + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }

    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }

    public long remove()
    {
        long popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        if (size!=0) {
            maxHeapify(FRONT);
        }
        return popped;
    }

    public static void main(String...arg)
    {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.maxHeap();

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.remove());
    }
}
