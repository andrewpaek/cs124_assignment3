/**
 * Created by Andrew on 4/20/2016.
 */
public class Repeated_Random {
    public int trial(int[] input_array, int max_Iter, String key) {
        representation r;
        if (key=="one"){
            r = new Rep_1(input_array);
        }
        else {
            r = new Rep_2(input_array);
        }

        int[] rep = r.return_array();
        int[] temp;
        int array_length = input_array.length;
        int val_best = r.residue(rep);
        int val_new;
        for (int i = 0; i < max_Iter; i++) {
            temp = r.generate(array_length);
            val_new = r.residue(temp);
            if (val_new < val_best) {
                rep = temp;
                val_best = val_new;
            }
        }
        return r.residue(rep);
    }
}
