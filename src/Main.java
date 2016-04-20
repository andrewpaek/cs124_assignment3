/**
 * Created by Andrew on 4/19/2016.
 */
public class Main {
    public static void main(String[] args){
        // Testing Rep_1 with steps
//        int[] test_array = {25, 17, 13, 8, 7, 4};
//        Hill_Climbing_Rep1 rep1 = new Repeated_Random_Rep1();
//        System.out.println(rep1.trial(test_array, 3));

        int[] test_array={25, 17, 13, 8, 7, 4};
        Rep_2 r = new Rep_2(test_array);
        int[] temp = r.return_array();
        r.residue(temp);


    }
}
