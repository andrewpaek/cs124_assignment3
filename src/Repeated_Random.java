/**
 * Created by Andrew on 4/20/2016.
 */
public class Repeated_Random {
    public int trial(int[] input_array, int max_Iter, String key) {
        representation r;
        if (key.equals("one")){
            r = new Rep_1(input_array);
        }
        else {
            r = new Rep_2(input_array);
        }

        int[] best_array = r.return_array();
        int[] new_array;
        int array_length = input_array.length;
        int val_best = Math.abs(r.residue(best_array));
        int val_new;
        for (int i = 0; i < max_Iter; i++) {
            new_array = r.generate(array_length);
            r.print(best_array);
            r.print(new_array);
            val_new = r.residue(new_array);
            if (Math.abs(val_new) < Math.abs(val_best)) {
                best_array = new_array;
                val_best = val_new;
            }
            System.out.println("BREAK");
        }
        System.out.println(val_best);
        return val_best;
    }
}
