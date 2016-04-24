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
        int[] temp2;
        int val_best = Math.abs(r.residue(best_array));
        int val_new;
        System.out.println("Testing Hill Cliimbing...");
        for (int i=0; i<max_iter; i++){
            System.out.println("Trial: " + i);
            temp2=r.random_step(best_array);
            System.out.print("Current Best: ");
            r.print(best_array);
            System.out.print("New step: ");
            r.print(temp2);
            val_new = Math.abs(r.residue(temp2));
            if (val_new<val_best){
                best_array=temp2;
                val_best = val_new;
            }
            System.out.println("");
        }
        System.out.println("Best Residue: " + val_best);
        System.out.print("Best A': ");
        return r.residue(best_array);
    }

}
