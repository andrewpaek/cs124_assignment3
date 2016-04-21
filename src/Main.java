/**
 * Created by Andrew on 4/19/2016.
 */
public class Main {
    public static void main(String[] args){

//        int[] temp2 = {10, 8, 7, 6, 5};
//        int[] temp = {0, 1, 1, 3, 4};
//        Rep_2 r = new Rep_2(temp2);
//        System.out.println(r.residue(temp));

        // testing repeated_random
        Repeated_Random r = new Repeated_Random();
        int[] temp = {20, 17, 13, 10, 5, 2};
        r.trial(temp, 3, "one");


    }
}
