/**
 * Created by Andrew on 4/17/2016.
 */
public class karp {


//    Outline:
//    1. turn input list into a max heap - create new empty array, turn into binary heap
//    2. extract two largest values in constant time
//    3. subtract values
//    4. insert difference of subtraction

    public long residue(long[] input_list){

        // initializing the max heap with our input list - one time nlogn time
        maxheap m_heap = new maxheap(input_list.length+1);
        for (long i:input_list){
            m_heap.insert(i);
        }
        long m1;
        long m2;
        long difference;
        while(m_heap.size>1){
            m1=m_heap.remove();
            m2=m_heap.remove();
            difference=m1-m2;
            m_heap.insert(difference);
        }
        return m_heap.remove();

    }



}
