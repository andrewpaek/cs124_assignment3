import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

/**
 * Created by Andrew on 4/19/2016.
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException{

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
            System.out.println("Running Instance: " + i + "...");
            writer.println("Instance: "+ i);
            writer.println("********************");
            long[] testing = g.generate(100);
            //System.out.println("Random Input: ");
            //r.print(testing);

            k.residue(testing);


            writer.println("Standard Random Repeated #" + i);
            long rr1_startTime = System.nanoTime();
            long rr1_residual = rr.trial(testing, maxIter, "one");
            long rr1_endTime = System.nanoTime();
            long rr1_duration = (rr1_endTime - rr1_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + rr1_residual);
            writer.println("Runtime: " + rr1_duration);
            writer.println("\n");


            writer.println("Pre-partitioned Random Repeated #" + i);
            long rr2_startTime = System.nanoTime();
            long rr2_residual = rr.trial(testing, maxIter, "two");
            long rr2_endTime = System.nanoTime();
            long rr2_duration = (rr2_endTime - rr2_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + rr2_residual);
            writer.println("Runtime: " + rr2_duration);
            writer.println("\n");

            writer.println("Standard Hill-Climbing #" + i);
            long hc1_startTime = System.nanoTime();
            long hc1_residual = h.trial(testing, maxIter, "one");
            long hc1_endTime = System.nanoTime();
            long hc1_duration = (hc1_endTime - hc1_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + hc1_residual);
            writer.println("Runtime: " + hc1_duration);
            writer.println("\n");

            writer.println("Pre-partitioned Hill-Climbing #" + i);
            long hc2_startTime = System.nanoTime();
            long hc2_residual = h.trial(testing, maxIter, "two");
            long hc2_endTime = System.nanoTime();
            long hc2_duration = (hc2_endTime - hc2_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + hc2_residual);
            writer.println("Runtime: " + hc2_duration);
            writer.println("\n");

            writer.println("Standard Annealing #" + i);
            long a1_startTime = System.nanoTime();
            long a1_residual = a.trial(testing, maxIter, "one");
            long a1_endTime = System.nanoTime();
            long a1_duration = (a1_endTime - a1_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + a1_residual);
            writer.println("Runtime: " + a1_duration);
            writer.println("\n");

            writer.println("Pre-Partitioned Annealing #" + i);
            long a2_startTime = System.nanoTime();
            long a2_residual = a.trial(testing, maxIter, "two");
            long a2_endTime = System.nanoTime();
            long a2_duration = (a2_endTime - a2_startTime) / 1000000; //in milliseconds.
            writer.println("Residual: " + a2_residual);
            writer.println("Runtime: " + a2_duration);
            writer.println("\n");

            writer.println("======================================== ");
            writer.println("======================================== ");
            writer.println("======================================== ");
            writer.println("\n");
            writer.println("\n");
            writer.println("\n");

        }
//
        writer.close();

    }
}
