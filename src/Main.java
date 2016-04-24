/**
 * Created by Andrew on 4/19/2016.
 */
public class main {
    public static void main(String[] args){

        // testing repeated_random

//        Repeated_Random r = new Repeated_Random();
//        long[] temp = {20, 17, 13, 10, 5, 2};
//        r.trial(temp, 10, "two");

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


        input_generator g = new input_generator();
        long[] temp = {13, 20, 35, 5, 2, 10};
        rep_2 r = new rep_2(temp);
        long[] testing = g.generate(10);
        r.print(testing);


    }
}
