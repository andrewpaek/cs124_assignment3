/**
 * Created by Andrew on 4/20/2016.
 */
public class repeated_random {
    public long trial(long[] input_array, int max_Iter, String key) {
        representation r;
        if (key.equals("one")){
            r = new rep_1(input_array);
        }
        else {
            r = new rep_2(input_array);
        }

        int[] best_array = r.return_array();
        int[] new_array;
        int array_length = input_array.length;
        long val_best = r.residue(best_array);
        long val_new;
        System.out.println("Testing Repeated Random...");
        for (int i = 0; i < max_Iter; i++) {
            System.out.println("Iteration: " + i);
            new_array = r.generate(array_length);
            val_new = r.residue(new_array);
            r.print(best_array);
            System.out.println(val_best);
            r.print(new_array);
            System.out.println(val_new);
            if (val_new < val_best) {
                best_array = new_array;
                val_best = val_new;
            }

        }

        System.out.println("Best Residue: " + val_best);
        return val_best;

    }
}
