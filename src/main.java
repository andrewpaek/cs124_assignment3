/**
 * Created by Andrew on 4/19/2016.
 */
public class main {
    public static void main(String[] args){

        // testing repeated_random

        repeated_random r = new repeated_random();
        long[] temp = {20, 17, 13, 10, 5, 2};
        r.trial(temp, 10, "two");

//        annealing a = new annealing();
//        long[] temp = {13, 20, 35, 5, 2, 10};
//        a.trial(temp, 5, "two");

//        Hill_Climbing h = new Hill_Climbing();
//        int[] temp = {13, 20, 17, 5, 2, 10};
//        h.trial(temp, 5, "one");



// 1. function to run 50 randomly generated instances
// 2. adding timing
// 3. figure out how to have a makefile
// 4. timing report
// 5. check results
// 6. write up for intro questions

//        input_generator g = new input_generator();
//        long[] temp = {13, 20, 35, 5, 2, 10};
//        rep_2 r = new rep_2(temp);
//
//        annealing a = new annealing();
//        hill_climbing h = new hill_climbing();
//        repeated_random rr = new repeated_random();
//        karp k = new karp();
//
//        int maxIter = 25000;
//
//        for (int i=0; i<50; i++){
//            long[] testing = g.generate(20);
//            System.out.println("Random Input: ");
//            r.print(testing);
//
//            k.residue(testing);
//
//            a.trial(testing, maxIter, "one");
//            a.trial(testing, maxIter, "two");
//
//            h.trial(testing, maxIter, "one");
//            h.trial(testing, maxIter, "two");
//
//            rr.trial(testing, maxIter, "one");
//            rr.trial(testing, maxIter, "two");
//        }

    }
}
