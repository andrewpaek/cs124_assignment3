/**
 * Created by Andrew on 4/19/2016.
 */
public class Main {
    public static void main(String[] args){

        // testing repeated_random

        int[] temp = {20, 17, 13, 10, 5, 2};
//        Repeated_Random r = new Repeated_Random();
//        r.trial(temp, 3, "two");
//
//        Hill_Climbing h = new Hill_Climbing();
//        h.trial(temp, 5, "one");

        annealing a = new annealing();
        a.trial(temp, 5, "one");

    }
}
