/**
 * Created by Andrew on 4/17/2016.
 */
public class karp_main{
    public static void main(String[] args){
        // This test case breaks when the if I take out the if caluse that I added to maxheap. Think about that...
        int[] testing = {17, 13, 10, 4, 2, 1};
        karp k = new karp();
        int m = k.residue(testing);
        System.out.println("Residue: "+m);
    }
}
