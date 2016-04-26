import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Andrew on 4/19/2016.
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/combined.txt");
        File kkout = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/kkoutput.txt");
        File kktime = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/kktime.txt");
        File rr1out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/rr1output.txt");
        File rr1time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/rr1time.txt");
        File rr2out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/rr2output.txt");
        File rr2time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/rr2time.txt");
        File hc1out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/hc1output.txt");
        File hc1time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/hc1time.txt");
        File hc2out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/hc2output.txt");
        File hc2time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/hc2time.txt");
        File a1out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/a1output.txt");
        File a1time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/a1time.txt");
        File a2out = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/a2output.txt");
        File a2time = new File("C:/cygwin64/home/Jason/CS124/pa3/cs124_assignment3/src/outputs/a2time.txt");

        file.getParentFile().mkdirs();
        kkout.getParentFile().mkdirs();
        kktime.getParentFile().mkdirs();
        rr1out.getParentFile().mkdirs();
        rr1time.getParentFile().mkdirs();
        rr2out.getParentFile().mkdirs();
        rr2time.getParentFile().mkdirs();
        hc1out.getParentFile().mkdirs();
        hc1time.getParentFile().mkdirs();
        hc2out.getParentFile().mkdirs();
        hc2time.getParentFile().mkdirs();
        a1out.getParentFile().mkdirs();
        a1time.getParentFile().mkdirs();
        a2out.getParentFile().mkdirs();
        a2time.getParentFile().mkdirs();

        PrintWriter writer = new PrintWriter(file);
        PrintWriter writerkkout = new PrintWriter(kkout);
        PrintWriter writerkktime = new PrintWriter(kktime);
        PrintWriter writerrr1out = new PrintWriter(rr1out);
        PrintWriter writerrr1time = new PrintWriter(rr1time);
        PrintWriter writerrr2out = new PrintWriter(rr2out);
        PrintWriter writerrr2time = new PrintWriter(rr2time);
        PrintWriter writerhc1out = new PrintWriter(hc1out);
        PrintWriter writerhc1time = new PrintWriter(hc1time);
        PrintWriter writerhc2out = new PrintWriter(hc2out);
        PrintWriter writerhc2time = new PrintWriter(hc2time);
        PrintWriter writera1out = new PrintWriter(a1out);
        PrintWriter writera1time = new PrintWriter(a1time);
        PrintWriter writera2out = new PrintWriter(a2out);
        PrintWriter writera2time = new PrintWriter(a2time);


        // starting algorithm
        input_generator g = new input_generator();
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

            writer.println("Karmarkar-Karp #" + i);
            long kk_startTime = System.nanoTime();
            long kk_residual = k.residue(testing);
            long kk_endTime = System.nanoTime();
            long kk_duration = (kk_endTime - kk_startTime) / 1000000; //in milliseconds.
            writerkkout.print(kk_residual);
            writer.print(kk_residual);
            writerkktime.print(" " + kk_duration);
            writer.print(" " + kk_duration);
            writer.println("\n");

            writer.println("Standard Random Repeated #" + i);
            long rr1_startTime = System.nanoTime();
            long rr1_residual = rr.trial(testing, maxIter, "one");
            long rr1_endTime = System.nanoTime();
            long rr1_duration = (rr1_endTime - rr1_startTime) / 1000000; //in milliseconds.
            writerrr1out.print(" " + rr1_residual);
            writerrr1time.print(" " + rr1_duration);
            writer.print(" " + rr1_residual);
            writer.print(" " + rr1_duration);
            writer.println("\n");


            writer.println("Pre-partitioned Random Repeated #" + i);
            long rr2_startTime = System.nanoTime();
            long rr2_residual = rr.trial(testing, maxIter, "two");
            long rr2_endTime = System.nanoTime();
            long rr2_duration = (rr2_endTime - rr2_startTime) / 1000000; //in milliseconds.
            writerrr2out.print(" " + rr2_residual);
            writerrr2time.print(" " + rr2_duration);
            writer.print(" " + rr2_residual);
            writer.print(" " + rr2_duration);
            writer.println("\n");

            writer.println("Standard Hill-Climbing #" + i);
            long hc1_startTime = System.nanoTime();
            long hc1_residual = h.trial(testing, maxIter, "one");
            long hc1_endTime = System.nanoTime();
            long hc1_duration = (hc1_endTime - hc1_startTime) / 1000000; //in milliseconds.
            writerhc1out.print(" " + hc1_residual);
            writerhc1time.print(" " + hc1_duration);
            writer.print(" " + hc1_residual);
            writer.print(" " + hc1_duration);
            writer.println("\n");

            writer.println("Pre-partitioned Hill-Climbing #" + i);
            long hc2_startTime = System.nanoTime();
            long hc2_residual = h.trial(testing, maxIter, "two");
            long hc2_endTime = System.nanoTime();
            long hc2_duration = (hc2_endTime - hc2_startTime) / 1000000; //in milliseconds.
            writerhc2out.print(" " + hc2_residual);
            writerhc2time.print(" " + hc2_duration);
            writer.print(" " + hc2_residual);
            writer.print(" " + hc2_duration);
            writer.println("\n");

            writer.println("Standard Annealing #" + i);
            long a1_startTime = System.nanoTime();
            long a1_residual = a.trial(testing, maxIter, "one");
            long a1_endTime = System.nanoTime();
            long a1_duration = (a1_endTime - a1_startTime) / 1000000; //in milliseconds.
            writera1out.print(" " + a1_residual);
            writera1time.print(" " + a1_duration);
            writer.print(" " + a1_residual);
            writer.print(" " + a1_duration);
            writer.println("\n");

            writer.println("Pre-Partitioned Annealing #" + i);
            long a2_startTime = System.nanoTime();
            long a2_residual = a.trial(testing, maxIter, "two");
            long a2_endTime = System.nanoTime();
            long a2_duration = (a2_endTime - a2_startTime) / 1000000; //in milliseconds.
            writera2out.print(" " + a2_residual);
            writera2time.print(" " + a2_duration);
            writer.print(" " + a2_residual);
            writer.print(" " + a2_duration);
            writer.println("\n");

            writer.println("======================================== ");
            writer.println("======================================== ");
            writer.println("======================================== ");
            writer.println("\n");
            writer.println("\n");

            writerkkout.println(" ");
            writerkktime.println(" ");
            writerrr1out.println(" ");
            writerrr1time.println(" ");
            writerrr2out.println(" ");
            writerrr2time.println(" ");
            writerhc1out.println(" ");
            writerhc1time.println(" ");
            writerhc2out.println(" ");
            writerhc2time.println(" ");
            writera1out.println(" ");
            writera1time.println(" ");
            writera2out.println(" ");
            writera2time.println(" ");


        }
//
        writerkkout.close();
        writerkktime.close();
        writerrr1out.close();
        writerrr1time.close();
        writerrr2out.close();
        writerrr2time.close();
        writerhc1out.close();
        writerhc1time.close();
        writerhc2out.close();
        writerhc2time.close();
        writera1out.close();
        writera1time.close();
        writera2out.close();
        writera2time.close();

    }
}
