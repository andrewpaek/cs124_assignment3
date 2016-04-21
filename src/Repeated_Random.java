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
        int val_best = Math.abs(r.residue(rep));
        int val_new;
        System.out.println("hello world");
        for (int i = 0; i < max_Iter; i++) {
            temp = r.generate(array_length);
            r.print(rep);
            r.print(temp);
            val_new = r.residue(temp);
            if (Math.abs(val_new) < Math.abs(val_best)) {
                rep = temp;
                val_best = val_new;
            }
            System.out.println("BREAK");
        }

        System.out.println(val_best);
        return r.residue(rep);
    }
}
