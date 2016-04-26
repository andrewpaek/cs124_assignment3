/**
 * Created by Jason on 4/25/2016.
 */
import java.util.Scanner;
import java.io.*;


public class kk {
    public static void main(String[] args) throws IOException {

        // first check to see if the program was run with the command line argument
        if (args.length < 1) {
            System.out.println("Error, usage: java ClassName inputfile");
            System.exit(1);
        }

        Scanner reader = new Scanner(new FileInputStream(args[0]));

        long token1;

        long[] temp=new long[100];
        int counter=0;
        // while loop
        while (reader.hasNext()) {
            // find next line
            token1 = reader.nextLong();
            temp[counter]=token1;
            counter+=1;
        }
        reader.close();


        karp k = new karp();
        System.out.println("Result: " + k.residue(temp));
    }
}
