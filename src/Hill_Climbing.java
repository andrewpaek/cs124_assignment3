/**
 * Created by Andrew on 4/19/2016.
 */
public class Hill_Climbing {

    public int trial (int[] input_array, int max_iter, String key){

        representation r;
        if (key.equals("one")){
            r = new Rep_1(input_array);
        }
        else {
            r = new Rep_2(input_array);
        }


        int[] best_array=r.return_array();
        int[] new_array;
        int val_best = Math.abs(r.residue(best_array));
        int val_new;
        for (int i=0; i<max_iter; i++){
            new_array=r.random_step(best_array);
            r.print(best_array);
            r.print(new_array);
            val_new = Math.abs(r.residue(new_array));
            if (val_new<val_best){
                best_array=new_array;
                val_best = val_new;
            }
            System.out.println("BREAK");
        }
        return r.residue(best_array);
    }

}
