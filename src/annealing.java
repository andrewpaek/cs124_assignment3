/**
 * Created by Andrew on 4/20/2016.
 */
public class annealing {
    public long trial(long[] input_array, int max_Iter, String key) {
        representation r;
        if (key.equals("one")) {
            r = new rep_1(input_array);
        } else {
            r = new rep_2(input_array);
        }

        int[] S = r.return_array();
        int[] S_best=r.copy_array(S);
        int[] S_temp;

        long S_res = r.residue(S);
        long S_best_res = r.residue(S_best);
        long S_temp_res;

        double probability;
        double random_number;

        for (int i=0; i<max_Iter; i++){
            S_temp = r.random_step(S);
            S_temp_res = r.residue(S_temp);
            r.print(S);
            System.out.println(S_res);
            r.print(S_best);
            System.out.println(S_best_res);
            r.print(S_temp);
            System.out.println(S_temp_res);
            System.out.println("BREAK");
            if (S_temp_res < S_res){
                S=S_temp;
                S_res = S_temp_res;
            }
            else{
                probability = Math.exp(-(S_temp_res-S_res)/T(i));
                random_number=Math.random();
                if (random_number<probability){
                    S=S_temp;
                    S_res = S_temp_res;
                }
            }
            if (S_res < S_best_res){
                S_best = S;
                S_best_res = S_res;
            }
        }
        System.out.println(S_best_res);
        return S_best_res;

    }

    public double T(int iter){
        double exp = iter/300;
        return Math.pow(10, 10)*Math.pow(0.8, exp);
    }

}
