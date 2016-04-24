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
        System.out.println("Testing Repeated Random...");
        for (int i = 0; i < max_Iter; i++) {
<<<<<<< HEAD
            System.out.println("Iteration: " + i);
            temp = r.generate(array_length);
            r.print(rep);
            r.print(temp);
            val_new = r.residue(temp);
=======
            new_array = r.generate(array_length);
            r.print(best_array);
            r.print(new_array);
            val_new = r.residue(new_array);
>>>>>>> 8bde0015fac85cf3b49964260a734d2fdb15da12
            if (Math.abs(val_new) < Math.abs(val_best)) {
                best_array = new_array;
                val_best = val_new;
            }

        }

<<<<<<< HEAD
        System.out.println("Best Residue: " + val_best);
        System.out.print("Best A': ");
        return r.residue(rep);
=======
        System.out.println(val_best);
        return r.residue(best_array);
>>>>>>> 8bde0015fac85cf3b49964260a734d2fdb15da12
    }
}
