/**
 * Created by Andrew on 4/17/2016.
 */
public class karp {


//    Outline:
//    1. turn input list into a max heap - create new empty array, turn into binary heap
//    2. extract two largest values in constant time
//    3. subtract values
//    4. insert difference of subtraction

    public int test1(int[] input_list){

        // initializing the max heap with our input list - one time nlogn time

        int marker = (input_list.length+1)%2;

        MaxHeap m_heap = new MaxHeap(input_list.length+1);
        for (int i:input_list){
            m_heap.insert(i);
        }


        int m1;
        int m2;
        int difference;
        while(m_heap.size>1){
            m1=m_heap.remove();
            m2=m_heap.remove();
            difference=m1-m2;
            m_heap.insert(difference);
        }
        return m_heap.remove();

    }



}
