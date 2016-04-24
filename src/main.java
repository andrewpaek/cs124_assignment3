import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

/**
 * Created by Andrew on 4/19/2016.
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException{
        long startTime = System.nanoTime();
        File file = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/output.txt");
        file.getParentFile().mkdirs();
        PrintWriter writer = new PrintWriter(file);
        // testing repeated_random

//        repeated_random r = new repeated_random();
//        long[] temp = {5, 13, 17, 10, 20, 2};
//        r.trial(temp, 10, "two");

        //annealing a = new annealing();
        //a.trial(temp, 5, "two");

        //hill_climbing h = new hill_climbing();
        //h.trial(temp, 5, "two");



// 1. function to run 50 randomly generated instances
// 2. adding timing
// 3. figure out how to have a makefile
// 4. timing report
// 5. check results
// 6. write up for intro questions

        input_generator g = new input_generator();
        long[] temp = {13, 20, 35, 5, 2, 10};
        rep_2 r = new rep_2(temp);

        annealing a = new annealing();
        hill_climbing h = new hill_climbing();
        repeated_random rr = new repeated_random();
        karp k = new karp();

        int maxIter = 25000;

        for (int i=0; i<50; i++){
            writer.println("Instance: "+ i);
            long[] testing = g.generate(10);
            System.out.println("Random Input: ");
            r.print(testing);

            k.residue(testing);


            writer.println("Random Repeated #" + i);
            long rr1_residual = rr.trial(testing, maxIter, "one");
            writer.println("Residual: " + rr1_residual);
            writer.println("\n");
            //rr.trial(testing, maxIter, "two");

            //h.trial(testing, maxIter, "one");
            //h.trial(testing, maxIter, "two");

            //a.trial(testing, maxIter, "one");
            //a.trial(testing, maxIter, "two");

        }
//
        writer.close();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000; //in milliseconds.
        System.out.println("Time in milliseconds: " + duration);
    }
}
