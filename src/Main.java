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
        int[] temparray = {10, 8, 7, 6, 5};

       // Repeated_Random r = new Repeated_Random();
       //r.trial(temparray, 4, "two");

        // testing Hill_Climbing
        Hill_Climbing h = new Hill_Climbing();
        h.trial(temparray, 4, "two");
    }
}
