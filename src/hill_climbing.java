/**
 * Created by Andrew on 4/19/2016.
 */
public class hill_climbing {

    public long trial (long[] input_array, int max_iter, String key){

        representation r;
        if (key.equals("one")){
            r = new rep_1(input_array);
        }
        else {
            r = new rep_2(input_array);
        }


        int[] best_array=r.return_array();
        int[] new_array;
        long val_best = r.residue(best_array);
        long val_new;
        System.out.println("Testing Hill Cliimbing...");
        for (int i=0; i<max_iter; i++){
            System.out.println("Iteration: " + i);
            new_array=r.random_step(best_array);
            System.out.print("Current Best: ");
            r.print(best_array);

            System.out.println("Residue: " + val_best);
            System.out.print("New step: ");
            r.print(new_array);
            val_new = r.residue(new_array);
            System.out.println("Residue: " + val_new);

            if (val_new<val_best){
                best_array=new_array;
                val_best = val_new;
            }
            System.out.println("");
        }

        System.out.println("Best Residue: " + val_best);
        System.out.print("Best A': ");
        return val_best;
    }

}
