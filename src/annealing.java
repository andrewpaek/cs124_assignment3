/**
 * Created by Andrew on 4/20/2016.
 */
public class annealing {
    public int trial(int[] input_array, int max_Iter, String key) {
        representation r;
        if (key.equals("one")) {
            r = new Rep_1(input_array);
        } else {
            r = new Rep_2(input_array);
        }

        int[] S = r.return_array();
        int[] S_best=r.copy_array(S);

        int[] S_temp;

        int S_res = r.residue(S);
        int S_best_res = r.residue(S_best);
        int S_temp_res;

        double probability;
        double random_number;

        for (int i=0; i<max_Iter; i++){
            S_temp = r.random_step(S);
            S_temp_res = r.residue(S_temp);
            if (S_temp_res < S_res){
                S=S_temp;
                S_res = S_temp_res;
            }
            else{
                probability = Math.exp(-(S_temp_res-S_res)/T(i));
                random_number=Math.random();
                System.out.println(probability);
                System.out.println(random_number);
                if (random_number<probability){
                    System.out.println("hello world");
                    S=S_temp;
                    S_res = S_temp_res;
                }
            }
            if (S_res < S_best_res){
                S_best = S;
                S_best_res = S_res;
            }
        }
        return r.residue(S_best);

    }

    public double T(int iter){
        double exp = iter/300;
        return Math.pow(10, 10)*Math.pow(0.8, exp);
    }

}